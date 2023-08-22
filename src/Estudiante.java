package herencia1.src;

public class Estudiante extends Persona {
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;


    public Estudiante(){
        super();
    }
    public Estudiante(int cl, String nombre, String apellido, String direccion, String telefono, int anio, String signo, int codigo, String correo, String semestre, String carrera) {
        super(cl, nombre, apellido, direccion, telefono, anio, signo);
        //atributos propios de la clase estudiante

        this.codigo=codigo;
        this.correo=correo;
        this.semestre=semestre;
        this.carrera=carrera;

    }

    public void estudiar(){
        System.out.println("Este es ele metodo estuadiar");

    }

    public void memorizar(){
        System.out.println("Este es el metodo memorizar");


    }




}
