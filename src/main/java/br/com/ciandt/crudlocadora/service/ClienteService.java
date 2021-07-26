package br.com.ciandt.crudlocadora.service;

import br.com.ciandt.crudlocadora.model.Cliente;
import br.com.ciandt.crudlocadora.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
