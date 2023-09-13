/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import PlatoPrincipal.Guarnicion;
import PlatoPrincipal.ProteinaCarnivora;

/**
 *
 * @author USUARIO
 */
public class ProductoCarnivoro {
    Guarnicion item1;
    Guarnicion item2;
    ProteinaCarnivora proteina;
    
    public ProductoCarnivoro (Guarnicion item1, Guarnicion item2, ProteinaCarnivora proteina){
        this.item1 = item1;
        this.item2 = item2;
        this.proteina = proteina;
    }

    public ProductoCarnivoro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void colocarItem1(Guarnicion item1){
        this.item1 =item1;
        System.out.println("se coloco el primer item en el producto: "+this.item1.caracteristicas());
    }
    public void colocarItem2 (Guarnicion item2){
        this.item2 = item2;
        System.out.println("se coloco el item2 en el producto: "+this.item2.caracteristicas());
    }
    public void colocarProteina (ProteinaCarnivora proteina){
        this.proteina = proteina;
        System.out.println("se coloco la proteina en el producto "+this.proteina.caracteristicas());
    }
}
