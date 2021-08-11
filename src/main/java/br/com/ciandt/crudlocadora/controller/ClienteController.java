package br.com.ciandt.crudlocadora.controller;

import br.com.ciandt.crudlocadora.model.Cliente;
import br.com.ciandt.crudlocadora.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @GetMapping
    public List<Cliente> list() {
        return clienteService.listAll();
    }

    @GetMapping("/{id}")
    public Cliente get(@PathVariable("id") Long id) {
        return clienteService.getOne(id);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        return clienteService.update(id, cliente);
    }
}
