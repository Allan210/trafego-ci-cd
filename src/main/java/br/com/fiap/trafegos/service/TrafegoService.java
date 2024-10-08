package br.com.fiap.trafegos.service;

import br.com.fiap.trafegos.model.Trafego;
import br.com.fiap.trafegos.repository.TrafegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafegoService {

    @Autowired
    private TrafegoRepository trafegoRepository;

    public Trafego salvar(Trafego trafego){
        return trafegoRepository.save(trafego);
    }

    public List<Trafego> listarTodosOsTrafegos(){
        return trafegoRepository.findAll();
    }

    public Trafego buscarPorId(Long id){
        var trafegoOptional = trafegoRepository.findById(id);

        if (trafegoOptional.isPresent()){
            return trafegoOptional.get();
        } else {
            throw new RuntimeException("Trafego não Existe!");
        }
    }
    public Trafego deletarPorId(Long id) {
        var trafegoOptional = trafegoRepository.findById(id);

        if (trafegoOptional.isPresent()) {
            trafegoRepository.deleteById(id);
        }
        else {
            throw new RuntimeException("Trafego não Existe!");
        }
        return null;
    }
}
