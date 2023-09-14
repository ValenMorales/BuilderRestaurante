/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builders;

import Productos.ProductoPostre;

/**
 *
 * @author Valentina
 * 
 * 
 */
public interface BuilderPostre {
    ProductoPostre producto=new ProductoPostre();
    public void colocarItem1();
    public void colocarItem2();
    public void colocarItem3();
    public double precio();
}