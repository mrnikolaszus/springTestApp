package com.nickzoos.springtestapp.controller;

import com.nickzoos.springtestapp.dto.EquipmentDTO;
import com.nickzoos.springtestapp.mapper.EquipmentMapper;
import com.nickzoos.springtestapp.model.Equipment;
import com.nickzoos.springtestapp.service.EquipmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eq")
public class EquipmentController {
    private final EquipmentService equipmentService;

    private final EquipmentMapper equipmentMapper;

    @Autowired
    public EquipmentController(EquipmentService equipmentService, EquipmentMapper equipmentMapper) {
        this.equipmentService = equipmentService;
        this.equipmentMapper = equipmentMapper;
    }

    @GetMapping(value = "/find/{id}")
    public EquipmentDTO findById(@PathVariable final Integer id){
        final Equipment equipment = equipmentService.getById(id);
        return equipmentMapper.toDto(equipment);
    }

    @PostMapping("/create")
    public ResponseEntity<EquipmentDTO> create(@Valid @RequestBody final EquipmentDTO equipmentDTO,
                                               final BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new RuntimeException("error");
        }

        Equipment equipment = equipmentService.save(equipmentMapper.toEntity(equipmentDTO));
        return new ResponseEntity<>(equipmentMapper.toDto(equipment), HttpStatus.CREATED);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EquipmentDTO> update(@PathVariable final Integer id,
                                               @Valid @RequestBody final EquipmentDTO equipmentDTO,
                                               final BindingResult bindingResult){
        Equipment equipment = equipmentService.update(id, equipmentMapper.toEntity(equipmentDTO));
        return new ResponseEntity<>(equipmentMapper.toDto(equipment), HttpStatus.CREATED);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<EquipmentDTO> delete(@PathVariable final Integer id){
        equipmentService.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
