package ejercicios;

import excepciones.ExcepcionSimpatica;

/**
 * Excepciones
 * @author arielp
 */
public class TrabajoPractico2 {

    public void ejercicio1() throws ExcepcionSimpatica {
        int[] array = new int[20];
        array[-7] = 24;
        System.out.println("No tengo que llegar hasta aca");
    }

    public void ejercicio2() {
        try {
            int[] array = new int[20];
            int suma = 2 / 0;
            array[50] = 24;
            System.out.println("no debo llegar aca");
            // Instrucciones cuando no hay una excepción
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Instrucciones cuando se produce una excepcion
            System.out.println("Excepcion: " + ex);     
        } finally {
            System.out.println("Finally Ejercicio 2");
            // Instruciones que se ejecutan, tanto si hay como sino hay excepciones
        }
    }

    public void ejercicio3() {
        int[] array = new int[20];
        try {
            int b = 0;
            int a = 23 / b;
            array[-10] = 24;            

            String s = null;
            s.equals("QQQQ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(" Error de índice en un array: " + ex);
        } catch (Exception ex) {
            System.out.println(" Error general: " + ex);
        } 
    }
    
    public void ejercicio4() throws Exception {
        System.out.println("Generando una excepcion");
        Exception ex = new Exception("Soy la excepcion");
        System.out.println("hola");
        
        throw ex;        
    }
    
    /**
     * Excepcion Propia
     */
    public void ejercicio5() {
        try {
            System.out.println("Primera parte");
            throw new ExcepcionSimpatica("Soy la excepcion");
        }catch(ExcepcionSimpatica e) {
            System.out.println("excepcion" +  e);
        } 
    }
    
    /**
     * Crear una excepcion propia y capturarla y mostrar su contenido.
     */
    public void ejercicio6() {
        
    }
}
