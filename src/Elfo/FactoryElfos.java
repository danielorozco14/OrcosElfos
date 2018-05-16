/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elfo;

import orco.Orcos;
import orcos.y.elfos.AbstractFactory;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class FactoryElfos implements AbstractFactory {

    @Override
    public Elfos getElfo(String type) {
        switch (type)
        {
            case "mago":
                return new Mago();
            case "rey elfo":
                return new ReyElfo();
            case "arquero":
                return new Arquero();
        }   
        return null;
    }

    @Override
    public Orcos getOrcos(String type) {
        return null;
    }

}
