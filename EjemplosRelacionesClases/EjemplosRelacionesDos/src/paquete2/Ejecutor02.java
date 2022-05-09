/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author PC
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        //crear una persona del barrio del Valle ciudad de Loja.
        //crear una persona del barrio central de la ciudad de Cuenca.
        //crear una persona del barrio Centenario de la ciudad de Guayaquil.
        
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("Valle", ciudad1);
        Barrio barrio2 = new Barrio("Barrio Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);
       
        Persona persona1 = new Persona("Carolina Alvarado", "1105716938", barrio1);
        Persona persona2 = new Persona("Jhandry Solorzano", "1105435763", barrio2);
        Persona persona3 = new Persona("Saskya Mendoza", "11045676938", barrio3);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n", persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");  
        
        persona2.establecerBarrio(barrio2);
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n", persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        persona3.establecerBarrio(barrio3);
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n", persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
    }
    
}
