package Unidad_2_Taller_8_HerenciaSimple;

public class Empleado {
    String nombre;
    double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles(){
        System.out.println(nombre + " " + salario);
    }
}
