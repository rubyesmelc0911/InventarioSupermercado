package hija;
import abstracta.articulo;
import enumP.estado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class alimento extends articulo {

private String fechaCaducidad;

public alimento(String sku, String nombre, double precio, estado estadoActual,String fechaCaducidad) {
    super(sku, nombre, precio);
    this.fechaCaducidad = fechaCaducidad;
}

@Override
public boolean verificarValidez() {
LocalDate fechaActual = LocalDate.now();
LocalDate fechaCaducidadDate = LocalDate.parse(fechaCaducidad, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
return fechaCaducidadDate.isAfter(fechaActual);
}

@Override
public double calcularDescuento(double porcentaje) {
    return precio * (1 - porcentaje);
}
}