/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersPostres;

import Builders.BuilderPostre;
import Dulces.Chispas;
import Dulces.Galleta;
import Dulces.Helado;

/**
 *
 * @author USUARIO
 */
public class BuilderPostreCuatro implements BuilderPostre {

    @Override
    public void colocarItem1() {
        producto.colocarItem1(new Helado());
  }

    @Override
    public void colocarItem2() {
        producto.colocarItem2(new Galleta());
     }

    @Override
    public void colocarItem3() {
  
    producto.colocarItem3(new Chispas());
    }
    
}
