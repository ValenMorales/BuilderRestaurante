/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersJugos;

import Builders.BuilderJugo;
import Frutas.Mango;
/**
 *
 * @author USUARIO
 */
public class BuilderMango implements BuilderJugo {

    @Override
    public void colocarFruta() {
      producto.colocarfruta1(new Mango()); }
     @Override
    public double precio() {
     return 5000; }
}
