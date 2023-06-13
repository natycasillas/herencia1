public class Futbolista extends Persona{
    private String equipo;
    private String pocicion;
    private String camiseta;
    private String representante;
    public  Futbolista(){
        super();
    }

    public Futbolista(int cl, String nombre, String apellido, String direccion, String telefono, String equipo, String pocicion, String camiseta, String representante,int anio,String signo) {
        super(cl, nombre, apellido, direccion, telefono,anio,signo);
        //atributos propios de la clase futbolista
        this.equipo=equipo;
        this.pocicion=pocicion;
        this.camiseta=camiseta;
        this.representante=representante;

    }
    public void correr(){
        System.out.println("Este es el metodo correr");

    }
    public void defender(){
        System.out.println("Este es el metodo defender");


    }
    public void entrenar(){
        System.out.println("Entrena 5 horas al dia");

    }


}
