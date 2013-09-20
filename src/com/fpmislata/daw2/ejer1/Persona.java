/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejer1;

/**
 *
 * @author alumno
 */
public class Persona {
    //propiedades
    private String nombre;
    private String apellido1;
    private Sexo sexo;
    private String dni;
    private String nombreCompleto;
    
    public Persona(String nombre, String apellido1,Sexo sexo, String dni){
        this.apellido1=apellido1;
        this.nombre=nombre;
        this.sexo=sexo;
        this.dni=dni;
    }

    //metodos accesores
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ap1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param ap1 the ap1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /*añadir una nueva propiedad sexo cuyo tipo sea un numerado
     *que tenga hombre y mujer
     */


    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

/*Constructor con parametro el nombre, 1er apellido y sexo*/
    //Se suele poner arriba

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombre + " " + apellido1;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    

}