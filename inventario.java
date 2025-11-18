import abstracta.articulo;
import enumP.estado;
import hija.alimento;
import hija.electronico;

import java.util.ArrayList;
//Ruby Esmeralda Lopez Correa y Citlali Garcia Espinoza

public class inventario {
    ArrayList<articulo> inv = new ArrayList<articulo>();

    public void aplicarOfertasFinDeSemana(){
       for(articulo art : inv){
        //llamada usando polimorfismo
        System.out.println("Articulo: "+ art.getNombre());
        System.out.println("SKU: "+ art.getSku());
        System.out.println("Precio original: "+ art.getPrecio());
        if(art instanceof electronico){
            electronico e = (electronico) art; //convierte la referencia de tipo articulo a electronico
            if(e.isReacondicionado()){
                System.out.println("Reacondicionado");
            }
        }
        art.calcularDescuento(0.10); //hacer llamada al descuento
        System.out.println("Precio con descuento: "+ art.getPrecio());
        System.out.println("-------------------------------------");
       }
    }

    public static void main(String[] args) {
        inventario inv = new inventario(); //genera una instancia de inventario para agregarle productos
        electronico artElectronico = new electronico("123", "Electronico Prod", 1000, estado.EN_STOCK, 2, true );
        alimento artAlimento = new alimento("325","Papas", 29,estado.EN_STOCK, "15/01/2026" );

        inv.inv.add(artElectronico); //accede a la instancia y luego a lo que esta dentro de esta
        inv.inv.add(artAlimento);

        //Imprimir usando el calcular descuento con el recorrido
        inv.aplicarOfertasFinDeSemana();
    }
}
