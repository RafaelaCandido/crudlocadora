package br.com.ciandt.crudlocadora.service;

import br.com.ciandt.crudlocadora.model.Cliente;
import br.com.ciandt.crudlocadora.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listAll() {
        List<Cliente> result = new ArrayList<>();
        clienteRepository.findAll().iterator().forEachRemaining(result::add);
        return result;
    }

    public Cliente getOne(long id) {
        return clienteRepository.findById(id).get();
    }

    public Cliente update(Long id, Cliente cliente) {
        Cliente clienteSalvo = getOne(id);
        clienteSalvo.setNome(cliente.getNome());
        clienteSalvo.setCpf(cliente.getCpf());
        clienteSalvo.setTelefone(cliente.getTelefone());
        clienteSalvo.setEndereco(cliente.getEndereco());
        return save(clienteSalvo);
    }
}
