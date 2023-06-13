public class Persona {

   private int cl;
   private String Nombre;
   private String Apellido;
   private String Direccion ;
   private String telefono;
   private int anio;
   private  String signo;


   public Persona(){
   }

    public Persona(int cl, String nombre, String apellido, String direccion, String telefono, int anio, String signo) {
        this.cl = cl;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        this.telefono = telefono;
        this.anio = anio;
        this.signo = signo;

    }

    public int getCl() {
        return cl;
    }

    public void setCl(int cl) {
        this.cl = cl;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    // crea metodos propios


    public void caminar(){
        System.out.println("Este es ele metodo de caminar");


    }

    public void trabajar(){
        System.out.println("Este es el metodo de trabajar que pertenece a persona");
    }


}
