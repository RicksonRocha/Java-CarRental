/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrent;

public class Van extends Veiculo{
    private final ModeloVan modelo;
            
    public Van(ModeloVan modelo, double valorDeCompra, String placa, int ano, Marca marca, Estado estado, Locacao locacao, Categoria categoria) {
        super(valorDeCompra, placa, ano, marca, estado, locacao, categoria);
        this.modelo = modelo;
    }
    
    public ModeloVan getModelo(){
        return this.modelo;
    }
            
    @Override
  public double getValorDiariaLocacao(){
        return switch (this.getCategoria()) {
            case POPULAR -> 200;
            case INTERMEDIARIO -> 400;
            case LUXO -> 600;
            default -> 0;
        };
  }   
}
