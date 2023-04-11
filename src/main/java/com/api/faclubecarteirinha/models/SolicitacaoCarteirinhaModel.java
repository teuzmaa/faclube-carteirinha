package com.api.faclubecarteirinha.models;

import org.aspectj.weaver.ast.Var;
import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TB_SOLICITACAO_CARTEIRINHA")
public class SolicitacaoCarteirinhaModel implements Serializable {
    private static final long serialVersionUID  = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false,length = 130)
    private String solicitacaoCarteirinhaNome;
    @Column(nullable = false)
    private LocalDate dataNascimento;
   @Column(nullable = false, length = 12)
    private String CPF;
    @Column(nullable = false,length = 8)
    private Long enderecoCEP;
    @Column(nullable = false,length = 300)
    private String enderecoRua;
    @Column(nullable = false,length = 6)
    private String enderecoNumero;
    @Column(length = 50)
    private String enderecoComplemento;
    @Column(nullable = false,length = 200)
    private String enderecoBairro;
    @Column(nullable = false, length = 255)
    private String enderecoCidade;
    @Column(nullable = false, length = 2)
    private String enderecoEstado;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSolicitacaoCarteirinhaNome() {
        return solicitacaoCarteirinhaNome;
    }

    public void setSolicitacaoCarteirinhaNome(String solicitacaoCarteirinhaNome) {
        this.solicitacaoCarteirinhaNome = solicitacaoCarteirinhaNome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Long getEnderecoCEP() {
        return enderecoCEP;
    }

    public void setEnderecoCEP(Long enderecoCEP) {
        this.enderecoCEP = enderecoCEP;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoEstado() {
        return enderecoEstado;
    }

    public void setEnderecoEstado(String enderecoEstado) {
        this.enderecoEstado = enderecoEstado;
    }

    public void setCpf(String cpf) {
        this.CPF = CPF;
    }
}
