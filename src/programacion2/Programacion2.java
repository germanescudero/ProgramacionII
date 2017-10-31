package programacion2;

import ejercicios.TrabajoPractico1;
import ejercicios.TrabajoPractico2;
import ejercicios.TrabajoPractico3;
import ejercicios.TrabajoPractico4;
import java.util.ArrayList;
import java.util.List;
import modelos.Cliente;
import modelos.DetallePedido;
import modelos.Mercaderia;
import modelos.Pedido;

public class Programacion2 {

    public static void main(String[] args) throws Exception {
       // TrabajoPractico3 practico = new TrabajoPractico3();
        //practico.ejercicio6();
        //practico.ejercicio7();
       /* TrabajoPractico3 practico = new TrabajoPractico3();
        
        Pedido pedido;
        
        pedido = practico.ejercicio2();
        
        System.out.println("Nombre Cliente");
        System.out.println(pedido.getCliente().getNombre());
        
        System.out.println("Mercaderia 2");
        System.out.println(pedido.getDetalles().get(1).getMercaderia().getNombre());
        
        List<DetallePedido> listaDetalles = pedido.getDetalles();
        DetallePedido detallePedido2 = listaDetalles.get(1);
        Mercaderia mercaderia = detallePedido2.getMercaderia();
        
        System.out.println("Mercaderia 2 - Ordenada");
        System.out.println(mercaderia.getNombre());
        
        System.out.println("Cantidad de Botellas");
        System.out.println(pedido.getDetalles().get(1).getCantidad());
        //
        TrabajoPractico4 practico4=new TrabajoPractico4();
        List<Cliente>clientes=new ArrayList();
        clientes=practico4.ejercicio3(20);*/
        TrabajoPractico3 practico3=new TrabajoPractico3();
        Pedido pedido=new Pedido();
        pedido=practico3.ejercicio3();
        
    }

}
