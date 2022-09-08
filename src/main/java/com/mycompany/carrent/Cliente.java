/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent;

import java.util.ArrayList;

class Cliente {
    public String nome;
    public String sobrenome;
    public String RG;
    public String CPF;
    public String endereco;
    ArrayList<Cliente> ClienteList;
    
    public Cliente(){
        ClienteList = new ArrayList();
    }
    
    public Cliente(String nome, String sobrenome, String RG, String CPF, String endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        ClienteList = new ArrayList();
    }
    
    public String getNome() {
	return nome;
    }
    
    public void setNome(String nome) {
	this.nome = nome;
    }
        
    public String getSobrenome() {
	return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
        
    public String getRG() {
        return RG;
    }

    public void setRG(String rg) {
	this.RG = rg;
    }
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
	this.CPF = cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
	this.endereco = endereco;
    }
    
    public ArrayList<Cliente> getListaCliente() {
	return ClienteList;
    }
    
    public void setListaCliente(ArrayList<Cliente> ClienteList) {
	this.ClienteList = ClienteList;
    }
    
    public void addCliente (Cliente C){
        ClienteList.add(C);
    }
}