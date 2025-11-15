package hija;

import abstracta.articulo;
import enumP.estado;

public class electronico extends articulo {
    private int garantiaMeses;
    private boolean esReacondicionado;

    public electronico(String sku, String nombre, double precio, estado estadoActual, int garantiaMeses, boolean esReacondicionado) {
        super(sku, nombre, precio);
        this.garantiaMeses = garantiaMeses;
        this.esReacondicionado = esReacondicionado;
    }

    @Override
    public boolean verificarValidez(){
        return true;
    }

    @Override
    public double calcularDescuento(double porcentaje){
        if (esReacondicionado) {
            porcentaje += 0.20;
        }
        return precio * (1-porcentaje);
    }
    
}
