/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildersPostres;

import Builders.BuilderPostre;
import Dulces.Brownie;
import Dulces.Galleta;
import Dulces.Oreo;

/**
 *
 * @author USUARIO
 */
public class BuilderPostreCuatro implements BuilderPostre {

    public BuilderPostreCuatro() {
    }

    @Override
    public void colocarItem1() {
        producto.colocarItem1(new Brownie());
    }

    @Override
    public void colocarItem2() {
        producto.colocarItem1(new Galleta());
    }

    @Override
    public void colocarItem3() {
        producto.colocarItem1(new Oreo());
    }

    @Override
    public double precio() {
        return 8500;
    }
    
}
