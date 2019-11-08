/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_animales;

/**
 * clase hija de animal preparada para perro 
 * con los metodos ladrar, desplazarse y toString los dos ultimos sobreescritos 
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
    
    
    /**
     * hacemos un override del metodo abstracto de la 
     * clase padre para que muestre la informacion especifica del hijo
     */
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
