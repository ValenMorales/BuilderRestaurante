/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersCombinados;

import Builders.BuilderCombinado;
import Frutas.*;

/**
 *
 * @author USUARIO
 */
public class MaraMora implements BuilderCombinado{

    @Override
    public void colocarFruta1() {
     producto.colocarfruta1(new Maracuya()); }

    @Override
    public void colocarFruta2() {
       producto.colocarfruta2(new Mora()); }
    
}
