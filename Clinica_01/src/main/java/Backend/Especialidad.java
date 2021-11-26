/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author landr
 */
public class Especialidad {
    
    //ATRIBUTOS
    private String Nombre;
    
    //METODOS GETTER AND SETTER

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    //CONSTRUCTOR

    public Especialidad(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
