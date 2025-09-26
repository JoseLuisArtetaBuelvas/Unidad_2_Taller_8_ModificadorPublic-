package Unidad_2_Taller_8_HerenciaSimple;

public class ProbarEmpleadoGerente {
    public static void main(String[] args){
        Empleado empleado = new Empleado("Irany", 20000);
        Gerente gerente = new Gerente("Jose", 3000000, "Ingenieria");
        empleado.mostrarDetalles();
        gerente.mostrarDetalles();
    }
}
