/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersJugos;

import Builders.BuilderJugo;
import Frutas.Mora;

/**
 *
 * @author USUARIO
 */
public class BuilderMora implements BuilderJugo {

    @Override
    public void colocarFruta() {
       producto.colocarfruta1(new Mora()); }

    @Override
    public double precio() {
     return 5000; }
   
}
