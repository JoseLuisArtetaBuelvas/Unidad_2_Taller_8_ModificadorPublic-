package Unidad_2_Taller_8_HerenciaSimple;

public class Vehiculo {
    String marca;
    int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca + " " + "Velocidad Maxima: " + velocidadMaxima);
    }
}
