package com.tcc.springboot.repository;

import com.tcc.springboot.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
