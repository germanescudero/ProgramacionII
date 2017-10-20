package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Arreglos y Listas
 * @author arielp
 */
public class TrabajoPractico1 {
    
    public void ejercicio1() {
        String[] palabras = new String[4];
        palabras[0] = "Esto";
        palabras[1] = "es";
        palabras[2] = "una";
        palabras[3] = "frase";
        
        System.out.println("Iterando Arreglos forma 1");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            System.out.println(palabra);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Arreglos forma 2");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
    
    public void ejercicio2() {
        List<String> palabras = new ArrayList();
        palabras.add("Esto");
        palabras.add("es");
        palabras.add("una");
        palabras.add("frase");
        
        System.out.println("Iterando Listas forma 1");
        for (int i = 0; i < palabras.size(); i++) {
            String palabra = palabras.get(i);
            System.out.println(palabra);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Listas forma 2");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        System.out.println("Iterando Listas forma 3 (Iterador)");
        Iterator<String> iterador = palabras.iterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
    
    /**
     * Crear un arreglo de numeros enteros del 1 al 5, recorrerlos y mostralos de las 2 formas
     */
    public void ejercicio3() {
        int[] numero = new int[5];
        numero[0]=5;
        numero[1]=200;
        numero[2]=4;
        numero[3]=456;
        numero[4]=98;
         System.out.println("Iterando Numeros forma 1");
        for (int i = 0; i < numero.length; i++) {
            int numeros = numero[i];
            System.out.println(numeros);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Numeros forma 2");
        for (int numeros : numero) {
            System.out.println(numeros);
        }
    }
    
    /**
     * Crear una lista de numeros enteros del 1 al 5, recorrerlos y mostarlos de las 3 formas
     */
    public void ejercicio4() {
        
    }
}
