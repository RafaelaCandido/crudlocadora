package br.com.ciandt.crudlocadora.service;

import br.com.ciandt.crudlocadora.model.Veículo;
import br.com.ciandt.crudlocadora.repository.VeículoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeículoService {

    @Autowired
    private VeículoRepository veículoRepository;

    public Veículo save(Veículo veículo) {
        return veículoRepository.save(veículo);
    }

    public List<Veículo> listAll() {
        List<Veículo> result = new ArrayList<>();
        veículoRepository.findAll().iterator().forEachRemaining(result::add);
        return result;
    }

    public Veículo getOne(Long id) {
        return veículoRepository.findById(id).get();
    }

    public Veículo update(Long id, Veículo veículo) {
        Veículo veículoSalvo = getOne(id);
        veículoSalvo.setMarca(veículo.getMarca());
        veículoSalvo.setCor(veículo.getCor());
        veículoSalvo.setAno(veículo.getAno());
        return save(veículoSalvo);
    }

    public void delete(Long id) {
        veículoRepository.deleteById(id);
    }
}
