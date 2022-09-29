/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibancode.patterndesign.lab3;

import com.cibancode.patterndesign.lab3.interfaces.volar;

/**
 *
 * @author Camilo
 */
public class Canario extends com.cibancode.patterndesign.lab3{
    
    /*(non-Javadoc)
    *@see ejercicioave.EjercicioAve#makeSound()
    */  
    public void makeSound(){
        System.out.println("Canta");
    }
    public void vuela(){
        System.out.println("vuela con alas");
    }
    public Canario(){
        logger.debug("instanciando un canario");
        tipoSonido = new Canto();
        tipoVuelo = new VueloConAlas();
    }
    public Canario(){
    logger .debug("instanciando un canario");
    this.setTipoSonido(new Canto());
    this.setTipoVuelo(new VueloConAlas());
    }   
}
