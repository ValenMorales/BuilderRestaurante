/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builders;

import Productos.ProductoVegetariano;

/**
 *
 * @author USUARIO
 */
public interface BuilderVegetariano {
    ProductoVegetariano producto = new ProductoVegetariano();
    public void colocaItem1();
    public void colocaItem2();
    public void colocaProteina();
}
