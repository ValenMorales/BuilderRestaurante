/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buildersCarnivoros;

import Builders.BuilderCarnivoro;
import static Builders.BuilderCarnivoro.producto;
import Guarniciones.*;
import ProteinasCarni.*;

/**
 *
 * @author USUARIO
 */
public class BuilderPlatoTresCarni implements BuilderCarnivoro {
     
    @Override
    public void colocaItem1() {
        producto.colocarItem1(new Papa());
    }

    @Override
    public void colocaItem2() {
          producto.colocarItem2(new Ensalada());
 }

    @Override
    public void colocaProteina() {
        producto.colocarProteina(new Pescado());
    }
        @Override
    public double precio() {
        return 15000;
    }

}
