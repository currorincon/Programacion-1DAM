package objetos;

public class Persona{

    public boolean profesor = false;

    private int edad;
    private String nombre;
    private int altura;
    private String DNI;

    /**
     * Constructor de la clase Persona()
     */
    public Persona(){
        System.out.println("Constructor invokado");
    }

    /**
     * Contructor parametrizado de la clase Persona()
     * @param nombre nombre de la clase persona
     * @param edad edad que tiene
     * @param altura altura que tiene
     * @param DNI y su DNI (PRIVADO)
     */
    public Persona(String nombre, int edad, int altura, String DNI){
        this.edad= edad;
        this.nombre = nombre;
        this.altura = altura;
        this.DNI = DNI;
    }

    /**
     * Constructor para incializar a una Persona solo con el nombre
     * @param nombre nombre de la persona
     */
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean isProfesor() {
        return profesor;
    }

    public void setProfesor(boolean profesor) {
        this.profesor = profesor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void decirHola(){
        System.out.println("Holaaaa, soy " + this.nombre);
    }

    public void decirEdad(){
        System.out.println("Soy " + this.nombre + " y tengo "+ this.edad +" años" );
    }

    @Override
    public String toString() {
        return "Persona{" +
                "profesor=" + profesor +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
