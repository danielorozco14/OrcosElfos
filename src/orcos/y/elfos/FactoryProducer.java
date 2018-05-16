/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcos.y.elfos;
import Elfo.FactoryElfos;
import orco.FactoryOrcos;
/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class FactoryProducer {
    public static AbstractFactory getFactory (String type){
        switch (type){
            case "orco":
                return new FactoryOrcos();
            case "elfo":
                return new FactoryElfos();
        }
        return null;
    }
    
    
}
