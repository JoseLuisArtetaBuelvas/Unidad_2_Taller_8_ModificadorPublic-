package Unidad_2_Taller_8_HerenciaSimple;

public class Coche extends Vehiculo{
    int numeroPuertas;

    public Coche(String marca, int velocidadMaxima, int numeroPuertas){
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
