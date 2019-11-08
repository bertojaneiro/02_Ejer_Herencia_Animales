/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_animales;

/**
 *
 * @author pc
 */
public class Percebe extends Animal {

    public Percebe() {
        habitat = Habitat.ACUATICO;
    }

    public Percebe(String nombre, int edad) {
        super(nombre, edad);
        habitat = Habitat.ACUATICO;
    }
    
    @Override
    public void alimentar(String alimento) {
        System.out.println(getNombre() + " se nutre de alimento " + alimento);
    }
    
    @Override
    public void desplazar() {
        System.out.println("Los percebes se adhieren a una roca.");
    }

    @Override
    public String toString() {
        return super.toString() + " es un percebe";
    }
    
    
}
