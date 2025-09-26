package Unidad_2_Taller_8_HerenciaSimple;

public class Estudiante extends Persona{
    String matricula;

    public Estudiante(String nombre, int edad, String matricula){
            super(nombre, edad);
            this.matricula = matricula;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Matricula " + matricula);
    }
}
