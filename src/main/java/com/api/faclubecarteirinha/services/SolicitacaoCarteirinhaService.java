package com.api.faclubecarteirinha.services;

import com.api.faclubecarteirinha.models.SolicitacaoCarteirinhaModel;
import com.api.faclubecarteirinha.repositories.SolicitacaoCarteirinhaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SolicitacaoCarteirinhaService {

    SolicitacaoCarteirinhaRepository solicitacaoCarteirinhaRepository;

    public SolicitacaoCarteirinhaService(SolicitacaoCarteirinhaRepository solicitacaoCarteirinhaRepository) {
        this.solicitacaoCarteirinhaRepository = solicitacaoCarteirinhaRepository;
    }

    @Transactional
    public SolicitacaoCarteirinhaModel save(SolicitacaoCarteirinhaModel solicitacaoCarteirinhaModel) {
        return solicitacaoCarteirinhaRepository.save(solicitacaoCarteirinhaModel);
    }

    public List<SolicitacaoCarteirinhaModel> getAll(){
        return solicitacaoCarteirinhaRepository.findAll();
    }
    public Optional<SolicitacaoCarteirinhaModel> getById(UUID id){
        return solicitacaoCarteirinhaRepository.findById(id);
    }

    @Transactional
    public List<SolicitacaoCarteirinhaModel> deleteById(UUID id){
        return solicitacaoCarteirinhaRepository.deleteById(id);
    }

    @Transactional
    public List<SolicitacaoCarteirinhaModel> updateById(SolicitacaoCarteirinhaModel model, UUID id){
        model.setId(id);
        return Collections.singletonList(solicitacaoCarteirinhaRepository.save(model));
    }

    public SolicitacaoCarteirinhaModel getByCpf(String cpf){
        return solicitacaoCarteirinhaRepository.findByCpf(cpf);
    }

    public Optional<SolicitacaoCarteirinhaModel> findById(UUID id) {
        return solicitacaoCarteirinhaRepository.findById(id);
    }
}
