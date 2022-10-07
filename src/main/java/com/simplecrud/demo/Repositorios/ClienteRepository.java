package com.simplecrud.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.simplecrud.demo.entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,String>, JpaSpecificationExecutor<Cliente>{
    
}
