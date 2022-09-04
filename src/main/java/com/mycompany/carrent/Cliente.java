/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent;

class Cliente {
    public String nome;
    public String sobrenome;
    public String RG;
    public String CPF;
    public String endereço;
    
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
}
