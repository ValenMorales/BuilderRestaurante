/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builders;

import Productos.ProductoCarnivoro;
import Productos.ProductoVegetariano;

/**
 *
 * @author USUARIO
 */
public interface BuilderCarnivoro {
    ProductoCarnivoro producto = new ProductoCarnivoro();
    public void colocaItem1();
    public void colocaItem2();
    public void colocaProteina();
    public double precio();
    
}
