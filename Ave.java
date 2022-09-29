/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ave;

import com.cibancode.patterndesign.lab4.supertype.TipoSonido;

/**
 *
 * @author Laura
 */
public abstract class Ave {
    
    private TipoSonido tipoSonido;
    private TipoVuelo tipoVuelo;
    
    public void setTipoSonido(TipoSonido tipoSonido){
        this.tipoSonido = tipoSonido;
 
    }
    public void setTipoVuelo(TipoVuelo tipoVuelo){
        this.tipoVuelo = tipoVuelo;
}
    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    public void realizaSonido(){
        tipoSonido.makeSound();
    }
}
