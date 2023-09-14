/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builders;

import Productos.ProductoCombinado;
import Productos.ProductoJugo;

/**
 *
 * @author USUARIO
 */
public interface BuilderJugo {
      ProductoJugo producto=new ProductoJugo();
    public void colocarFruta();
    public double precio();
   
}
