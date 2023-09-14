/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import Builders.*;

/**
 *
 * @author USUARIO
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    }
    
     public void EnsamblarPlatoCarnivoro(BuilderCarnivoro construir)
    {
     construir.colocaItem1();
     construir.colocaItem2();
     construir.colocaProteina();
    }
     
     public void EnsamblarPlatoVegetariano (BuilderVegetariano construir){
         construir.colocaItem1();
         construir.colocaItem2();
         construir.colocaProteina();
         
     }
     
     public void EnsamblarPostre (BuilderPostre construir){
         construir.colocarItem1();
         construir.colocarItem2();
         construir.colocarItem3();
     }
}
