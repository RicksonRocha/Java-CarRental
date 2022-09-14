/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent;

import java.util.Calendar;

class Locacao {
    public int dias;
    public double valor;
    public Calendar data;
    private final Cliente cliente;

    public Locacao(int dias, double valor, Calendar data, Cliente cliente) {
        this.dias = dias;
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
    }
       
    public double getValor(){
        return this.valor;
    }
    public Calendar getData(){
       return this.data;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    
    
    
}
