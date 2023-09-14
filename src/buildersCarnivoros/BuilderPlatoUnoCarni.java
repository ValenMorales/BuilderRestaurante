/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buildersCarnivoros;

import Builders.BuilderCarnivoro;
import Guarniciones.Ensalada;
import Guarniciones.Papa;
import ProteinasCarni.CarnePlancha;
import view.View;

/**
 *
 * @author USUARIO
 */
public class BuilderPlatoUnoCarni implements BuilderCarnivoro {
    
    public BuilderPlatoUnoCarni() {
       
    }

    @Override
    public void colocaItem1() {
        Papa papa= new Papa();
        producto.colocarItem1(papa);
    }

    @Override
    public void colocaItem2() {
        Ensalada ensalada = new Ensalada();
          producto.colocarItem2(ensalada);
 }

    @Override
    public void colocaProteina() {
        producto.colocarProteina(new CarnePlancha());
    }
        @Override
    public double precio() {
        return 30000;
    }

}
