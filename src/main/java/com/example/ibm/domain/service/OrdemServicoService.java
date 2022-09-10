package com.example.ibm.domain.service;

import com.example.ibm.domain.entity.OrdemServico;

import com.example.ibm.domain.repository.OrdemServicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrdemServicoService {

    private final OrdemServicoRepository OrdemServicoRepository;

    public OrdemServico salvar(OrdemServico ordemServico){
        return OrdemServicoRepository.save(ordemServico);

    }

    public List<OrdemServico> listarTodos(){
        return OrdemServicoRepository.findAll();
    }

    public Optional<OrdemServico> buscarPorId(Long id){

        return OrdemServicoRepository.findById(id);
    }

    public void deletar(Long id){

        OrdemServicoRepository.deleteById(id);
    }

}
