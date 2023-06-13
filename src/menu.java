import java.sql.SQLOutput;

public class menu {
    public static void main(String[] args) {
        Persona miPersona=new Persona(1755729769,"nataly","Casillas","Quito","1552654",4586,"virgo");

             Persona Pedro=new Persona();
             Doctor Ana=new Doctor();
             Empleado_publico Pablo=new Empleado_publico();
             Pablo.setNombre("Pablo");
             Ana.setNombre("Ana");
             Pablo.setTelefono("095656546");
             Ana.setAnio(30);
             Futbolista Maritzaa=new Futbolista();
             Maritzaa.setNombre("Maritza");
             Estudiante Melany=new Estudiante();
             Melany.setNombre(" Melany");


      System.out.println(miPersona.getNombre());
        System.out.println(Pedro.getCl());
        Estudiante Nataly=new Estudiante(17655454,"nataly","casillas"," QUITO","3635265",45454,"virgo",15584,"naty123","3RO","SD");

        Estudiante Maritza=new Estudiante();



      //  System.out.println("Nataly"+Nataly.getCl());


     //   Maritza.setNombre("Maritza");
      //  System.out.println("Nombre: " + Maritza.getNombre());
      //  Maritza.caminar();
      //  Maritza.trabajar();
       System.out.println(Ana.getNombre() + " es Doctora");
        System.out.println(("tene ")+Ana.getAnio()+"anos");
        Ana.examinar();

        System.out.println(Pablo.getNombre() + " es Empleado publico");
        System.out.println("sus telefono es "+(Pablo.getTelefono()));

        Pablo.tramitar();

        System.out.println("");
        System.out.println(Maritzaa.getNombre()+"es futbolista");
        System.out.println("Entrena 5 horas diarias ");

       Maritzaa.correr();

        System.out.println("");
        //MELANY

        System.out.println(Melany.getNombre()+"es estudiante");
        System.out.println();

    }



}