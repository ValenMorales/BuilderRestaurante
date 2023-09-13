/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersPostres;


import Builders.BuilderPostre;
import Dulces.Helado;
import static Builders.BuilderPostre.producto;
import Dulces.Galleta;
import Dulces.Oreo;


/**
 *
 * @author USUARIO
 */
public class BuilderPostreUno implements BuilderPostre{

    @Override
    public void colocarItem1() {
        producto.colocarItem1(new Helado());
 }

    @Override
    public void colocarItem2() {  producto.colocarItem1(new Oreo());
  }

    @Override
    public void colocarItem3() {
        producto.colocarItem3(new Galleta());
  }
    
}
