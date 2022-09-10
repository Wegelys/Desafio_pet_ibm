package com.example.ibm.domain.service;


import com.example.ibm.domain.entity.Animal;

import com.example.ibm.domain.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;

    public Animal salvar(Animal animal){
        return animalRepository.save(animal);

    }

    public List<Animal> listarTodos(){
        return animalRepository.findAll();
    }

    public Optional<Animal> buscarPorId(Long id){

        return animalRepository.findById(id);
    }

    public void deletar(Long id){

        animalRepository.deleteById(id);
    }
}
