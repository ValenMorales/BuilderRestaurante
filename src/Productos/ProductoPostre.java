/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import Dulces.Dulce;

/**
 *
 * @author USUARIO
 */
public class ProductoPostre {
    Dulce dulce1;
    Dulce dulce2;
    Dulce dulce3;
     public ProductoPostre (Dulce item1, Dulce item2, Dulce item3){
        this.dulce1 = item1;
        this.dulce2 = item2;
        this.dulce3 = item3;
    }

    public ProductoPostre() {
 }
    
    public void colocarItem1(Dulce dulce1){
        this.dulce1 =dulce1;
        System.out.println("se coloco el primer item en el producto: "+this.dulce1.caracteristicas());
    }
    public void colocarItem2 (Dulce dulce2){
        this.dulce2 = dulce2;
        System.out.println("se coloco el item2 en el producto: "+this.dulce2.caracteristicas());
    }
    public void colocarItem3 (Dulce dulce3){
        this.dulce3 = dulce3;
        System.out.println("se coloco la proteina en el producto "+this.dulce3.caracteristicas());
    }
    
}
