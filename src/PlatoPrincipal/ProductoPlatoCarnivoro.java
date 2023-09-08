/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlatoPrincipal;

/**
 *
 * @author USUARIO
 */
public class ProductoPlatoCarnivoro {
    Guarnicion guarnicion1;
    Guarnicion guarnicion2;
    ProteinaCarnivora proteina;
    
    public ProductoPlatoCarnivoro(){
        
    }
    
    public ProductoPlatoCarnivoro(Guarnicion guarnicion1, Guarnicion guarnicion2, ProteinaCarnivora proteina){
        this.guarnicion1 = guarnicion1;
        this.guarnicion2 = guarnicion2;
        this.proteina = proteina;
    }
    public void colocarGuarnicion1(Guarnicion guarnicion1){
        this.guarnicion1 = guarnicion1;
        System.out.println("se coloco la guarnicion 1 en el producto:  "+this.guarnicion1.caracteristicas());
    }
    public void colocarGuarnicion2 (Guarnicion guarnicion2 ){
        this.guarnicion2 = guarnicion2;
        System.out.println("se coloco la guarnicion 2 en el producto: "+this.guarnicion2.caracteristicas());
    }
    public void colocarProteina(ProteinaCarnivora proteina){
        this.proteina = proteina;
        System.out.println("se coloco la proteina en el producto"+this.proteina.caracteristicas());
    }
    
}
