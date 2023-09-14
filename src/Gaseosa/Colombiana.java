/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gaseosa;

import Builders.BuilderGaseosa;

/**
 *
 * @author Sergi
 */
public class Colombiana implements BuilderGaseosa {

    @Override
    public double precio() {
        return 3000.0;
    }

    @Override
    public String Gaseosa() {
        return "colombiana";
    }
    
}
