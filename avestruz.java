/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aves;

/**
 *
 * @author User
 */
public class avestruz extends ave{
public void makeSound(){
    System.out.println("<<silencio>>");
}    
public avestruz(){
    logger.debug.("instanciado avestruz");
    tiposonido=new Sincanto();
    tipovuelo=new Sinvuelo();
}

 logger.debug.("instanciado avestruz");
 this.setTiposonido(new Sincanto());
 this.setTipovuelo(new Sinvuelo());

}
