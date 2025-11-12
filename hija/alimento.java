package hija;
import abstracta.articulo;
import enumP.estado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class alimento {

private String fechaCaducidad;

public alimento(String sku, String nombre, double precio, estado estdoActual,String fechaCaducidad) {
    super(sku, nombre, precio, estadoActual);
    this.fechaCaducidad = fechaCaducidad;
}

@Override
public boolean verificarValidez() {
LocalDate fechaActual = LocalDate.now();
LocalDate fechaCaducidadDate = LocalDate.parse(fechaCaducidad, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
return caducidad.isAfter(fechaActual);
}

@Override
public double calcularDescuento(double porcentaje) {
    return precio * (1 - porcentaje);
}
