/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersJugos;

import Builders.BuilderJugo;
import Frutas.Maracuya;
/**
 *
 * @author USUARIO
 */
public class BuilderMaracuya implements BuilderJugo{

    @Override
    public void colocarFruta() {
        producto.colocarfruta1(new Maracuya());
        }
    @Override
    public double precio() {
     return 5000; }
}
