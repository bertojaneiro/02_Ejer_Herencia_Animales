/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_animales;

/**
 *
 * @author Equipo 1
 */
public abstract class Animal {
    private String nombre;
    private int edad;
    private int peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public abstract void desplazar();

    @Override
    public String toString() {
        return "Animal: nombre: " + nombre + ", edad: " + edad + ", peso: " + peso;
    }
    
    
 
    
    
    
    
    
}
