/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aves;

/**
 *
 * @author User
 */
public class tipoSonido {
    
public interface tipodesonido{
    
void makesound();
}
public class grasnido implements tiposonido{
    
public static final Logger logger=Logger.factory.getLogger(grasnido.class);
public void makesound(){
    logger.debug("grasnido");
    System.out.println("grasnido");
}
} 
public class sincanto implements tiposonido{
    public static final Logger logger=Logger.factory.getLogger(sincanto.class);
    public void makesound(){
    logger.debug("<<silencio>>");
    System.out.println("<<silencio>>");
    
}
}
public class canto implements tiposonido{
    public static final Logger logger=Logger.factory.getLogger(canto.class);
public void makesound(){
    logger.debug("estoy cantando");
    System.out.println("estoy cantando");
}
}
}