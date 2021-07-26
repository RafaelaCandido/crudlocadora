package br.com.ciandt.crudlocadora.repository;

import br.com.ciandt.crudlocadora.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
