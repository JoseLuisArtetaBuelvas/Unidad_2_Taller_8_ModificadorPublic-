package Unidad_2_Taller_8_HerenciaSimple;

public class Persona {
    String nombre;
    int edad;
    private int identificacion;


    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + "Edad: " + edad);
    }
}
