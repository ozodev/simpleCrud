package com.simplecrud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplecrud.demo.Repositorios.ClienteRepository;
import com.simplecrud.demo.entidades.Cliente;

@Controller
@RequestMapping("/cliente") // localhost:8080/cliente/*
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("") // localhost:8080/cliente
    public ResponseEntity getClientes() {
        Cliente cliente = new Cliente("dawdaw", "sebastian");
        clienteRepository.save(cliente);
        return new ResponseEntity(cliente, HttpStatus.OK);
    }
}