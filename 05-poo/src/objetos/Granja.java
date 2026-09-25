package objetos;

import utilidades.Utils;

public class Granja {

    private String dirreccion;
    public int hectareas;
    public String tipologia;
    private Animal animales;

    public Granja(String dirreccion, int hectareas, String tipologia) {
        this.dirreccion = dirreccion;
        this.hectareas = hectareas;
        this.tipologia = tipologia;
    }
    public Granja(){

    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public void inicializarAnimales(){

        String nombre = Utils.pedirCadenaUsuario("Dame nombre para el animalico");
        String tipo = Utils.pedirCadenaUsuario("Dame tipo para el animalico");
        int edad = Utils.pedirNumeroUsuario("Dame edad para el animalico");
        animales = new Animal(nombre, tipo, edad);

    }

    public void verAnimales(){
        System.out.println(animales.toString());
    }

    @Override
    public String toString() {
        return "Granja{" +
                "dirreccion='" + dirreccion + '\'' +
                ", hectareas=" + hectareas +
                ", tipologia='" + tipologia + '\'' +
                '}';
    }

    public void setearDatos() {
        int velocidad = Utils.pedirNumeroUsuario("Dame velocidad para el animalico");
        int peso = Utils.pedirNumeroUsuario("Dame peso para el animalico");

        animales.setPeso(peso);
        animales.setVelocidad(velocidad);

    }
}
