/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gaseosa;

import Builders.BuilderBebida;

/**
 *
 * @author Sergi
 */
public class Pepsi implements BuilderBebida{

    @Override
    public double precio() {
        return 4000.0;
    }

    @Override
    public String caracteristica() {
        return "Pepsi";
    }
    
}
