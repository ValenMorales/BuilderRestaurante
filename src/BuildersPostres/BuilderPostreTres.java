/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersPostres;

import Builders.BuilderPostre;
import static Builders.BuilderPostre.producto;
import Dulces.Brownie;
import Dulces.Chispas;
import Dulces.Galleta;
import Dulces.Helado;

/**
 *
 * @author USUARIO
 */
public class BuilderPostreTres implements BuilderPostre{

    public BuilderPostreTres() {
    }
         @Override
    public void colocarItem1() {
        producto.colocarItem1(new Brownie());
 }

    @Override
    public void colocarItem2() {  producto.colocarItem1(new Chispas());
  }

    @Override
    public void colocarItem3() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double precio() {
        return 7000;
    }


}
