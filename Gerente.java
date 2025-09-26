package Unidad_2_Taller_8_HerenciaSimple;

public class Gerente extends Empleado{
    String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println(departamento);
    }
}
