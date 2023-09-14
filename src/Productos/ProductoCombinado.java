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
public class ProductoCombinado {
    Fruta fruta1;
    Fruta fruta2;
    
    public ProductoCombinado(){};
    public ProductoCombinado(Fruta fruta1, Fruta fruta2){
        this.fruta1 = fruta1;
        this.fruta2 = fruta2;
    }
    
    public void colocarfruta1(Fruta fruta){
    this.fruta1 = fruta ;
        System.out.println("se coloco la primera fruta en el jugo: "+this.fruta1.caracteristicas());
            }
    public void colocarfruta2(Fruta fruta){this.fruta2 = fruta ;
        System.out.println("se coloco la segunda fruta en el jugo: "+this.fruta2.caracteristicas());}
    
        
    
}
