/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academico.view;

import java.util.Calendar;

/**
 *
 * @author gabriel
 */
public class Usuario {
    
    private String nome;
    private Calendar anoNascimento;
    private String cpf;
    private String login;
    private String senha;
    private Calendar dataCadastro;
    
    public void setNome(String nome){
        this.nome=nome;    
    }
    public String getNome(){
        return this.nome;
    }
    public void setAnoNascimento(Calendar anoNascimento){
        this.anoNascimento=anoNascimento;    
    }
    public Calendar getAnoNascimento(){
        return this.anoNascimento;    
    }
    public void setCpf(String cpf){
        this.cpf=cpf;    
    }
    public String getCpf(){
        return this.cpf;    
    }
    public void setLogin(String login){
        this.login=login;    
    }
    public String getLogin(){
        return this.login;    
    }
    public void setSenha(String senha){
        this.senha=senha;    
    }
    public String getSenha(){
        return this.senha;    
    }
    public void setDataCadastro(Calendar dataCadastro){
        this.dataCadastro=dataCadastro;    
    }

    public Calendar getDataCadastro(){
        return this.dataCadastro;    
    }
    
    
    
    
}
