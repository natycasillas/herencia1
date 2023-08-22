package herencia1.src;

public class Empleado_publico extends Persona {

    private String puesto;
    private String cargo;
    private int cod;
    public  Empleado_publico(){
        super();
    }


    public Empleado_publico(int cl, String nombre, String apellido, String direccion, String telefono, String puesto, String cargo, int cod,int anio,String signo) {
        super(cl, nombre, apellido, direccion, telefono, anio,signo);
        //atributos propios de la clase empleado_publico
        this.puesto=puesto;
        this.cargo=cargo;
        this.cod=cod;

    }
    public void tramitar(){
        System.out.println("Este es el metodo tramitar");

    }
    public void trabajar2(){
        System.out.println("Este es el metodo trabajar");


    }



}
