/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buildersVegetarianos;

import static Builders.BuilderCarnivoro.producto;
import Builders.BuilderVegetariano;
import Guarniciones.*;
import ProteinasVege.*;

/**
 *
 * @author USUARIO
 */
public class BuilderPlato1Vege implements BuilderVegetariano{
     
    @Override
    public void colocaItem1() {
        producto.colocarItem1(new Ensalada());
    }

    @Override
    public void colocaItem2() {
          producto.colocarItem2(new Arepa());
 }

    @Override
    public void colocaProteina() {
        producto.colocarProteina(new AlbondigaLenteja());
    }
}
