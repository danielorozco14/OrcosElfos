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
public interface AbstractFactory {
    
    Elfos getElfo(String type);
    Orcos getOrcos(String type);
            
}
