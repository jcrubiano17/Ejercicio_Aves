/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gallina;
import com.cibancode.patterndesign.lab5;

import org.slf4j.Logger;
/**
 *
 * @author Laura
 */
public class Gallina  extends Ave{

   
    public static final Logger logger = LoggerFactory.getLogger (Gallina,class); 
     
    public Gallina (){
        logger.debug ("instanciando una gallina");
        this.setTipoSonido ( new Grasnido());
        this.setTipoVuelo ( new VueloConAlas());
    }
    
}
