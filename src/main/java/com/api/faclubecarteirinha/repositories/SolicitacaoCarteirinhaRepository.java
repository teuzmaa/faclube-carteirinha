package com.api.faclubecarteirinha.repositories;

import com.api.faclubecarteirinha.models.SolicitacaoCarteirinhaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SolicitacaoCarteirinhaRepository extends JpaRepository<SolicitacaoCarteirinhaModel, UUID> {
    SolicitacaoCarteirinhaModel findByCpf(@Param("cpf") String CPF);
}
