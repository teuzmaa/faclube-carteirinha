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

import javax.validation.Valid;
import java.util.List;

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

}
