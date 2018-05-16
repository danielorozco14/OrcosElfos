/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orco;

import Elfo.Elfos;
import orcos.y.elfos.AbstractFactory;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class FactoryOrcos implements AbstractFactory {

    @Override
    public Elfos getElfo(String type) {
        return null;
    }

    @Override
    public Orcos getOrcos(String type) {
        switch (type){
            case "hechicero":
                return new Hechicero();
            case "bestia mayor":
                return new BestiaMayor();
            case "lanzador":
                return new Lanzador();
                
        }
        return null;
    }

}
