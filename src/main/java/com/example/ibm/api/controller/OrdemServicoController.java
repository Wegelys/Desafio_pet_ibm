package com.example.ibm.api.controller;


import com.example.ibm.domain.entity.Animal;
import com.example.ibm.domain.entity.OrdemServico;

import com.example.ibm.domain.service.OrdemServicoService;
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
@RequestMapping("/OrdemServico")
public class OrdemServicoController {

    private final OrdemServicoService service;

    @PostMapping
    public ResponseEntity<OrdemServico> salvar(@RequestBody OrdemServico ordemServico){

        OrdemServico ordemServicoSalvo = service.salvar(ordemServico);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordemServico);

    }
    @GetMapping
    public ResponseEntity<List<OrdemServico>>  listarTodos(){

        List<OrdemServico> ordemServico = service.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(ordemServico);

    }
}
