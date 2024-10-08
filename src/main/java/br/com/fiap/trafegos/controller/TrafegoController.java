package br.com.fiap.trafegos.controller;

import br.com.fiap.trafegos.model.Trafego;
import br.com.fiap.trafegos.service.TrafegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trafego")
public class TrafegoController {

    @Autowired
    private TrafegoService trafegoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Trafego salvar(@RequestBody Trafego trafego){
        return trafegoService.salvar(trafego);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  Trafego buscarPorId(@PathVariable Long id){
        return trafegoService.buscarPorId(id);
    }
    @GetMapping("/todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Trafego> listarTodos(){
        return trafegoService.listarTodosOsTrafegos();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Trafego deletarPorId(@PathVariable Long id){
        return trafegoService.deletarPorId(id);
    }

}

