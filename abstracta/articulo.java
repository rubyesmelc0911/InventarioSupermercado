package abstracta;
import enumP.estado;

public abstract class articulo{
    protected String sku;
    protected String nombre;
    protected double precio;
    protected estado estadoAtr;

    public articulo(String sku, String nombre, double precio, estado estadoAtrEstado) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
        this.estadoAtr = estadoAtrEstado;
    }

    public String getSku() {
        return sku;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    public abstract boolean verificarValidez();

    public abstract double calcularDescuento(double porcentaje);
    

}