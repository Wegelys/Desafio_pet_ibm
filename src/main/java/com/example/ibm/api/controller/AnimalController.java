package com.example.ibm.api.controller;

import com.example.ibm.domain.entity.Animal;
import com.example.ibm.domain.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/animal")
public class AnimalController {

    private final AnimalService service;

    @PostMapping
    public ResponseEntity<Animal> salvar(@RequestBody Animal animal){

       Animal animalSalvo = service.salvar(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(animalSalvo);

    }
    @GetMapping
    public ResponseEntity<List<Animal>>  listarTodos(){

        List<Animal> animal = service.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(animal);

    }
}
