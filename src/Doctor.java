package herencia1.src;

public class Doctor extends Persona {

    private String especialidad;
    private int codigo;
    private String horario;
    public  Doctor(){
        super();
    }

    public Doctor(int cl, String nombre, String apellido, String direccion, String telefono, String especialidad, int codigo, String horario,int anio,String signo) {
        super(cl, nombre, apellido, direccion, telefono,anio,signo);
        //atributos propios de la clase doctor
        this.especialidad=especialidad;
        this.codigo=codigo;
        this.horario=horario;

    }

    public void examinar(){
        System.out.println("Este es el metodo examinar");

    }
    public void curar(){

        System.out.println("este es el metodo curar");


    }



}
