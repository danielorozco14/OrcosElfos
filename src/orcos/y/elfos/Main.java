/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcos.y.elfos;
import Elfo.Elfos;
import orco.Orcos;
/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractFactory factory;
        
        System.out.println("*** LOS ORCOS ATACAN CON LA BESTIA ***");
        factory= FactoryProducer.getFactory("orco");
        Orcos bestia= factory.getOrcos("bestia");
        bestia.PelearBestia();
        
        System.out.println("*** LOS ELFOS DESPLIEGAN A LOS ARQUEROS ***");
        factory= FactoryProducer.getFactory("elfo");
        Elfos arquero=factory.getElfo("arquero");
        arquero.LanzarFlecha();
        
        
        
        
        
    }
    
}
