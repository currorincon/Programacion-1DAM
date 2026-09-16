package objetos;

public class Animal {

    private String nombre;
    private String tipo;
    public int peso;
    private int edad;
    public int velocidad;

    public Animal(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                ", velocidad=" + velocidad +
                '}';
    }
}
