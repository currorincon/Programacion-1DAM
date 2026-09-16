package recap;

public class Usuario {

    private String nombreUsario;
    private long password;

    /**
     * Constructor de la clase Usuario
     * @param nombreUsario
     * @param password
     */
    public Usuario(String nombreUsario, long password) {
        this.nombreUsario = nombreUsario;
        this.password = password;
    }

    public String getNombreUsario() {
        return nombreUsario;
    }

    public void setNombreUsario(String nombreUsario) {
        this.nombreUsario = nombreUsario;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public boolean comprobarPassword(long passIntroducida){

        return this.password == passIntroducida;

    }
}
