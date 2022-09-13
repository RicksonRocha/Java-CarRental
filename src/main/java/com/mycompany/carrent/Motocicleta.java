/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent;

public class Motocicleta extends Veiculo{
   private final ModeloMotocicleta modelo;
    
    public Motocicleta(double valorDeCompra, String placa, int ano, Marca marca, Estado estado, Locacao locacao, Categoria categoria, ModeloMotocicleta modelo) {
        super(valorDeCompra, placa, ano, marca, estado, locacao, categoria);
        this.modelo = modelo;
    }
    
    public ModeloMotocicleta getModelo(){
        return this.modelo;
    }
    
    @Override
  public double getValorDiariaLocacao(){
       return switch (this.getCategoria()) {
           case POPULAR -> 70;
           case INTERMEDIARIO -> 200;
           case LUXO -> 350;
           default -> 0;
       };
  }
}
