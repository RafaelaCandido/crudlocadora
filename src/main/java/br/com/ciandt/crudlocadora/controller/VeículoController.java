package br.com.ciandt.crudlocadora.controller;

import br.com.ciandt.crudlocadora.model.Veículo;
import br.com.ciandt.crudlocadora.service.VeículoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/veículos")
public class VeículoController {

    @Autowired
    private VeículoService veículoService;

    @PostMapping
    public Veículo create(@RequestBody Veículo veículo) {
        return veículoService.save(veículo);
    }

    @GetMapping
    public List<Veículo> list() {
        return veículoService.listAll();
    }

    @GetMapping("/{id}")
    public Veículo get(@PathVariable("id") Long id) {
        return veículoService.getOne(id);
    }

    @PutMapping("/{id}")
    public Veículo update(@PathVariable("id") Long id, @RequestBody Veículo veículo) {
        return veículoService.update(id, veículo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        veículoService.delete(id);
    }
}
