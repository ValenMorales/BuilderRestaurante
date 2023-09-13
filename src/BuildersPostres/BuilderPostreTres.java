/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersPostres;

import Builders.BuilderPostre;
import static Builders.BuilderPostre.producto;
import Dulces.Chispas;
import Dulces.Galleta;
import Dulces.Helado;

/**
 *
 * @author USUARIO
 */
public class BuilderPostreTres implements BuilderPostre{
         @Override
    public void colocarItem1() {
        producto.colocarItem1(new Helado());
 }

    @Override
    public void colocarItem2() {  producto.colocarItem1(new Galleta());
  }

    @Override
    public void colocarItem3() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
