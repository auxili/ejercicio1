/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Main {
    public static void main (String[]args){
        //acceso a las variables set y get
        Persona persona1, persona2, persona3;
        persona1 = new Persona("Enrique","Nuñez",Sexo.Hombre,"1A");
        
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido1());
        System.out.println("Sexo: " + persona1.getSexo());
        System.out.println("dni: " + persona1.getDni());
        //crear una variable para crear una lista de personas:
        //creraremos persona1, 2 3
        persona2 = new Persona("Toni","Platas",Sexo.Hombre,"2B");
        persona3 = new Persona("Paco","Porras",Sexo.Hombre,"3C");
        
        
        //forma cutre
        //ArrayList a = new ArrayList();
        //el problema de esto es que te permite meter personas y cualquier otra cosa
        /*si te equivocas el navegador no te avisa asi que lo modificamos*/
        List<Persona> personas = new ArrayList<Persona>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        
        System.out.println("Numero de personas: " + personas.size());
        /*ahora tachamos el array porque
         *lo bueno del arraylist es que te gestiona el tamaño del array y lo modifica
         * según el espacio ocupado o el vacío.
         * Pero hay otra forma de HACER LISTAS: linkedlist<Personas>(); que nos permite añadir
         * cosas entre medias muy rapidamente.
         * Al final ambos casos van a tener los mismos metodos y son equivalentes.
         * Si quisieramos imprimir personas, lo declararíamos así?
         * 
         * private void imprimirPersonas (ArrayList<Persona> personas){
         * }
         * private void borrarPeronas (ArrayList<Persona> personas){
         * }
         * private void imprimirImpresoraPersonas (ArrayList<Persona> personas){
         * }
         * En el fondo nos daría igual si es linked o array list, porque la impresion
         * se hará igual:
         */
        List<Persona> b = new ArrayList<Persona>();
        //de echo si lo cambio así luego dará igual que la impresión sea a través de
        //arraylist o linkedlist
        List<Persona> personas1 = new LinkedList<Persona>();
        
        
        //BUCLE y luego econtrar un dni en la lista
        String buscaDni="2B";
        for (Persona persona:personas){
            int posicion=1;
            posicion++;
            if (buscaDni.equals(persona.getDni())){
                System.out.println("DNI" + persona.getDni()+"encontrado"
                        + " en posición " + posicion );
            }
            System.out.println(persona.getDni());
            
        }
        //QUE ES UN MAP
        /*
         * hay varios, uno de ellos el HASMAP
         * 
         */
        Map<String,Persona> mapPersonas = new HashMap<String,Persona>();
        mapPersonas.put(persona1.getDni(), persona1);
        mapPersonas.put(persona2.getDni(), persona2);
        mapPersonas.put(persona3.getDni(), persona3);
        
        //llamamos al dni para que lo muestre
        //hay que hacer el objetocompleto antes.
        System.out.println(mapPersonas.get("2B")); 
        //esto no funciona porque estoy imprimiendo personas y tenddria que ser:
        for (Persona persona:personas){
            if(persona.getDni().equals(buscaDni)){//buscaDni = variable declarada para buscar dni en el otro for anterior
                System.out.println(persona.getNombre());
            }
        }
        //CORRECCIÓN
        System.out.println("CORRECCIÓN");
        System.out.println("==========");
        Persona personaBuscada = mapPersonas.get("1A");
        System.out.println(personaBuscada);
        //AHORA LO RECCORREMOS LAS CLAVES
        Set<String> dnis = mapPersonas.keySet();
        //esto me devuelve una lista/set de dnis
        for (String dni:dnis){
            Persona persona = mapPersonas.get(dni);
            System.out.println(dni + " " + persona.getNombreCompleto());
            
        }
        
        //recorrer el map y mostrar todos los dni (claves) y nombres (Valor):
        //guardamos los resultados en un set
        HashSet<Persona> listaPersonas = new HashSet();
        for (Persona persona:personas){
            mapPersonas.keySet();
            persona.getDni();
        }
    
    /*
     * mirar libreta LIST vs MAP
     */
    
    }
    
    
    //esto de abajo era para explicar lo del linkedlist y arraylist y list
    private static void imprimirConsolaPersonas(List<Persona> personas){
        
    }
    //como vemos hacerlo así nos limita menos
    
}

