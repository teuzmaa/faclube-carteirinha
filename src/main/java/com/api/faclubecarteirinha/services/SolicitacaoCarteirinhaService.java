package com.api.faclubecarteirinha.services;

import com.api.faclubecarteirinha.models.SolicitacaoCarteirinhaModel;
import com.api.faclubecarteirinha.repositories.SolicitacaoCarteirinhaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SolicitacaoCarteirinhaService {

    final SolicitacaoCarteirinhaRepository solicitacaoCarteirinhaRepository;

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
}
