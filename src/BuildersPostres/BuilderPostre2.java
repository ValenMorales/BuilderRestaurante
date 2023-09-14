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
import Dulces.Oreo;

/**
 *
 * @author USUARIO
 */
public class BuilderPostre2 implements BuilderPostre{

    public BuilderPostre2() {
    }
   
       @Override
    public void colocarItem1() {
        producto.colocarItem1(new Helado());
 }

    @Override
    public void colocarItem2() {  producto.colocarItem1(new Galleta());
  }

    @Override
    public void colocarItem3() {
        producto.colocarItem3(new Chispas());
  }

    @Override
    public double precio() {
        return 4000;
    }
}
