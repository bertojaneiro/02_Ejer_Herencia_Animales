/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_animales;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class test {

    @Test
    public void testHerenciaAnimalesPerro() {
        Perro perro = new Perro();

        perro.setEdad(2);
        assertEquals(perro.getEdad(), 2);

        perro.setPeso(10f);
        assertEquals(perro.getPeso(), 10f, 0);

        perro.setRaza("Pastor alemán");
        assertEquals(perro.getRaza(), "Pastor alemán");

        perro.setNombre("Pluto");
        assertEquals(perro.getNombre(), "Pluto");

        assertEquals(perro.getHabitat(), Habitat.TERRESTRE);

        perro.alimentar("hueso");

        perro.desplazar();

        Animal.mostrar(perro);
        
        assertEquals(perro.toString(), "Animal: nombre: Pluto, edad: 2, peso: 10.0 es un perro de la raza Pastor alemán");
    }
    
    @Test
    public void testHerenciaAnimalesPercebe() {
        Percebe percebe = new Percebe();

        percebe.setEdad(1);
        assertEquals(percebe.getEdad(), 1);

        percebe.setPeso(0.1f);
        assertEquals(percebe.getPeso(), 0.1f, 0);

        percebe.setNombre("Toby");
        assertEquals(percebe.getNombre(), "Toby");

        assertEquals(percebe.getHabitat(), Habitat.ACUATICO);

        percebe.alimentar("fitoplacton");

        percebe.desplazar();

        Animal.mostrar(percebe);
        
        assertEquals(percebe.toString(), "Animal: nombre: Toby, edad: 1, peso: 0.1 es un percebe");
    }

    @Test
    public void testHerenciaAnimales() {
        Perro pluto = new Perro("Pluto", 2);
        Perro pancho = new Perro("Pancho", 3);
        Percebe toby = new Percebe("Toby", 1);
        Percebe juan = new Percebe("Juan", 0);
        
        Animal[] animales = {pluto, pancho, toby, juan};
        
        System.out.println("---------");
        
        for (Animal animal : animales) {
            
            animal.alimentar("alimento");

            animal.desplazar();

            Animal.mostrar(animal);
            
            System.out.println();
        }
        System.out.println("---------");
    }
}
