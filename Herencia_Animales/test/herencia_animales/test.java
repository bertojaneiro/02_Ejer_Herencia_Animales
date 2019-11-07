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
     public void testHerenciaAnimales() {
         Perro perro = new Perro();
         
         perro.setEdad(2);
         assertEquals(perro.getEdad(), 2);
         
         perro.setPeso(10f);
         assertEquals(perro.getPeso(), 10f, 0);
         
         perro.setRaza("Pastor alemán");
         assertEquals(perro.getRaza(), "Pastor alemán");
         
         perro.setNombre("Pluto");
         assertEquals(perro.getNombre(), "Pluto");
     }
     
}
