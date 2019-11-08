/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_animales;

/**
 * creamos la clase padre animal con los parametros 
 * nombre, edad, peso y habitat
 * con sus correspondientes metodos
 * @author Equipo 1
 */
public abstract class Animal {
    private String nombre;
    private int edad;
    private float peso;

    /**
     * creamos el habitat como un protected enum 
     * para que otras clases puedan accerder a el.
     */
    protected Habitat habitat;
    
    /**
     * el valor de peso inicializado a un float.
     */
    public Animal() { peso = 10f; }
    
    /**
     * en el constructor le damos un valor por defecto al peso (float).
     * @param nombre
     * @param edad 
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        peso = 10f;
    }

    /**
     * @return devolvemos el habitat (enum)
     */
    public Habitat getHabitat() {
        return habitat;
    }
    
    public void alimentar(String alimento) {
        System.out.println(nombre + " mastica y come " + alimento);
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

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    /**
     * creamos desplazar como una funcion abstracta 
     * por el posterior uso distinto de las clases hijas
     */
    public abstract void desplazar();
    
    /**
     * hacemos un override a String para preparar el posterior uso de las clases hijas y otros metodos
     * @return devolvemos la informacion del animal nombre/edad/peso
     */
    @Override
    public String toString() {
        return "Animal: nombre: " + nombre + ", edad: " + edad + ", peso: " + peso;
    }
    
    /**
     * creamos la funcion statica mostrar() 
     * usando el metodo toString previamente sobrescrito
     * @param animal
     * @return 
     */
    public static String mostrar(Animal animal) {
        System.out.println(animal.toString());
        return animal.toString();
    }
}
