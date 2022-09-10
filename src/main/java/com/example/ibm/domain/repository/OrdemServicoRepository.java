package com.example.ibm.domain.repository;

import com.example.ibm.domain.entity.Animal;
import com.example.ibm.domain.entity.OrdemServico;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {


    Optional<OrdemServico> findById(Long  id);

}
