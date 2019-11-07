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
    private float peso;
    Habitat habitat;

    public Animal() { peso = 10f; }
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        peso = 10f;
    }

    public Habitat getHabitat() {
        return habitat;
    }
    
    public void alimentar(String alimento) {
        System.out.println(nombre + "  mastica y come " + alimento);
    }

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

    public float getPeso() {
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
    
    public static void mostrar(Animal animal) {
        System.out.println(animal.toString());
    }
}
