/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent;

public class Automovel extends Veiculo{
    
    private final ModeloAutomovel modelo;
    
    public Automovel(double valorDeCompra, String placa, int ano, Marca marca, Estado estado, Locacao locacao, Categoria categoria, ModeloAutomovel modelo) {
        super(valorDeCompra, placa, ano, marca, estado, locacao, categoria);
        this.modelo = modelo;
    }

    public ModeloAutomovel getModelo(){
        return this.modelo;
    }
    
  @Override
  public double getValorDiariaLocacao(){
        return switch (this.getCategoria()) {
            case POPULAR -> 100;
            case INTERMEDIARIO -> 300;
            case LUXO -> 450;
            default -> 0;
        };
  }
}
