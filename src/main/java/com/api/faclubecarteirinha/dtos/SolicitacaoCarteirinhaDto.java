package com.api.faclubecarteirinha.dtos;

import org.aspectj.weaver.ast.Var;
import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class SolicitacaoCarteirinhaDto {

    @NotBlank
    private String solicitacaoCarteirinhaNome;
    @NotBlank
    private LocalDate dataNascimento;
    /*@NotBlank
    @Size(max = 12)
    private int CPF;*/
    @NotBlank
    @Size(max = 8)
    private Long enderecoCEP;
    @NotBlank
    private String enderecoRua;
    @NotBlank
    private String enderecoNumero;
    @NotBlank
    private String enderecoBairro;
    @NotBlank
    private String enderecoCidade;
    @NotBlank
    @Size(max = 2)
    private String enderecoEstado;

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

   /* public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }*/

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
}
