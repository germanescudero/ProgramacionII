package ejercicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelos.DetallePedido;
import modelos.Cliente;

/**
 * Listas con Entidades
 * Haciendo un cambio pequeño
 */
public class TrabajoPractico4 {

    /**
     * Ejemplos de listas y objetos.
     */
    public void ejercicio1() {
        DetallePedido detalle1 = new DetallePedido();
        detalle1.setCantidad(7);
        DetallePedido detalle2 = new DetallePedido();
        detalle2.setCantidad(8);
        DetallePedido detalle3 = new DetallePedido();
        detalle3.setCantidad(9);

        List<DetallePedido> detalles = new ArrayList();
        detalles.add(detalle1);
        detalles.add(detalle2);
        detalles.add(detalle3);

        for (int i = 0; i < detalles.size(); i++) {
            DetallePedido detalle = detalles.get(i);
            System.out.println(detalle.getCantidad());
        }

        for(DetallePedido detalle : detalles) {
            System.out.println(detalle.getCantidad());
        }

        Iterator<DetallePedido> iterator = detalles.listIterator();
        while(iterator.hasNext()) {
            DetallePedido detalle = iterator.next();
            System.out.println(detalle.getCantidad());
        }
    }

    /**
     * 1. Crear n clientes y agregarlos a una lista.
     * 2. Recorrer la lista y mostrar un mensaje para cada cliente de la forma:
     *  Cliente Numero: {id}
     *  Nombre: Nombre_{id}
     *  Email: email_{id}@gmail.com
     * @param cantidadClientes
     * @return
     */
    public List<Cliente> ejercicio2(int cantidadClientes) {
        List<Cliente> clientes = new ArrayList();

        for (int i = 1; i <= cantidadClientes; i++) {
            Cliente cliente = new Cliente();
            cliente.setId(i);
            cliente.setNombre("nombre_" + i);
            cliente.setEmail("email_" + i + "gmail.com");

            clientes.add(cliente);
        }

        for(Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getId());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("");
        }

        return clientes;
    }


    /**
     * Crear una lista de 20 clientes y mostrar solo los clientes con id impar
     * El ID empieza en 1
     * @param clientes
     */
    public List<Cliente> ejercicio3(int cantidadClientes) {
         List<Cliente>listaClientes=new ArrayList();
          for (int i = 1; i <= cantidadClientes; i++) {
            Cliente cliente = new Cliente();
            cliente.setId(i);
            cliente.setNombre("nombre_" + i);
            cliente.setEmail("email_" + i + "gmail.com");

            listaClientes.add(cliente);
        }

        for(int i=0;i<listaClientes.size();i+=2) {
            
            System.out.println("Cliente: " + listaClientes.get(i).getId());
            System.out.println("Nombre: " + listaClientes.get(i).getNombre());
            System.out.println("Email: " + listaClientes.get(i).getEmail());
            System.out.println("");
        }
         return listaClientes;
    }
}
