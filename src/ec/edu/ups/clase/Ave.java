/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.interfaz.Acciones;

/**
 *
 * @author Bryam
 */
public class Ave extends Animal implements Acciones {

    @Override
    public void comer() {
        System.out.println("El ave " + this.getNombre() + " esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El ave " + this.getNombre() + " esta durmiendo");
    }

    @Override
    public void moverse() {
        System.out.println("El ave " + this.getNombre() + " se esta moviendo");
    }

    @Override
    public void jugar() {
        System.out.println("El ave " + this.getNombre() + " esta jugando");
    }

    @Override
    public void reproducirse() {
        System.out.println("El ave " + this.getNombre() + " se esta reproduciendo");
    }

}
