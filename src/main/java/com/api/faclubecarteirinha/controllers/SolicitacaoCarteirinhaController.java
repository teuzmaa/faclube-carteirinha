package com.api.faclubecarteirinha.controllers;

import com.api.faclubecarteirinha.dtos.SolicitacaoCarteirinhaDto;
import com.api.faclubecarteirinha.models.SolicitacaoCarteirinhaModel;
import com.api.faclubecarteirinha.services.SolicitacaoCarteirinhaService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/faclube-carteirinha")
public class SolicitacaoCarteirinhaController {

    final SolicitacaoCarteirinhaService solicitacaoCarteirinhaService;

    public SolicitacaoCarteirinhaController(SolicitacaoCarteirinhaService solicitacaoCarteirinhaService) {
        this.solicitacaoCarteirinhaService = solicitacaoCarteirinhaService;
    }

    @PostMapping
    public ResponseEntity<Object> saveSolicitacaoCarteirinha(@RequestBody SolicitacaoCarteirinhaModel model){
        return ResponseEntity.status(HttpStatus.CREATED).body(solicitacaoCarteirinhaService.save(model));
    }
    @GetMapping
    public ResponseEntity<Object> getSolicitacoes(){
        List<SolicitacaoCarteirinhaModel> solicitacoes = solicitacaoCarteirinhaService.getAll();
        return new ResponseEntity<>(solicitacoes,HttpStatus.OK);
    }

    @PutMapping("/{id}/cpf")
    public ResponseEntity<Object> updateSolicitacaoCarteirinhaCpf(@PathVariable Long id, @RequestBody String cpf){
        SolicitacaoCarteirinhaModel solicitacao = solicitacaoCarteirinhaService.findById(id);
        if (solicitacao == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Solicitação não encontrada");
        }
        solicitacao.setCpf(cpf);
        solicitacaoCarteirinhaService.save(solicitacao);
        return ResponseEntity.status(HttpStatus.OK).body(solicitacao);

        @GetMapping( "/UUID/{id}")
        public ResponseEntity<Object> getSolicitacaoById(@PathVariable UUID id);{
            List<SolicitacaoCarteirinhaModel> solicitacao = solicitacaoCarteirinhaService.getById(id);
            return new ResponseEntity<>(solicitacao, HttpStatus.OK);
        }

        /*@PutMapping(value = "/{id}")
        public ResponseEntity<Object> updateById(@RequestBody SolicitacaoCarteirinhaModel model, @PathVariable UUID id); {
            return ResponseEntity.status(HttpStatus.OK).body(solicitacaoCarteirinhaService.updateById(model));
        }*/

        @DeleteMapping(value = "/{id}")
        public void> deleteSolicitacaoCarteirinha(@PathVariable UUID id);{
            solicitacaoCarteirinhaService.deleteById(id);
        }

        @GetMapping(value = "/{cpf}")
        public ResponseEntity<Object> getSolicitacaoByCpf(@PathVariable String cpf);{
            List<SolicitacaoCarteirinhaModel> solicitacao = solicitacaoCarteirinhaService.getByCpf(cpf);
            return new ResponseEntity<>(solicitacao, HttpStatus.OK);
        }

    }


}





