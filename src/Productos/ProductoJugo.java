/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import Frutas.Fruta;

/**
 *
 * @author USUARIO
 */
public class ProductoJugo {
     Fruta fruta;
    
    public ProductoJugo(){};
    public ProductoJugo(Fruta fruta){
        this.fruta = fruta;
    }
    
    public void colocarfruta1(Fruta fruta){
    this.fruta= fruta ;
        System.out.println("se coloco la fruta en el jugo: "+this.fruta.caracteristicas());
            }
  
}
