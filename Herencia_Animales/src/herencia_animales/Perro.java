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
public class Perro extends Animal{

    private String raza;

    public Perro() {
        habitat = Habitat.TERRESTRE;
    }

    public Perro(String nombre, int edad) {
        super(nombre, edad);
        habitat = Habitat.TERRESTRE;
    }
    
    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
    @Override
    public void desplazar() {
        System.out.println(getNombre()+" corre contento.");
    }
    
    public void ladrar(){
        System.out.println(getNombre()+" dice 'guau guau guau!'");
    }

    @Override
    public String toString() {
        return super.toString()+" es un perro de la raza "+getRaza(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
