package recap;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> usarios = new HashMap<>();

        ArrayList<EventoImpl> eventos = new ArrayList<>();

        eventos.add(new EventoOnline("Tareas Moodle", LocalDateTime.now(), "Moodle"));
        eventos.add(new EventoPresencial("Charla", LocalDateTime.now(), "Aula 14"));


        cargarUsuarios(usarios);

        System.out.println("Introduce usuario: ");
        String user = sc.nextLine();
        System.out.println("Introduce contraseña: ");
        String pass = sc.nextLine();

        if(loguearse(user, pass,usarios)){

            int opcion = 0;
            do{

                if(user.equals("admin"))
                    mostrarMenuAdmin();
                else mostrarMenu();

                opcion = sc.nextInt();

                switch (opcion){
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    case 1:
                        mostrarEventos(eventos);
                        break;
                    case 3:
                        System.out.println("Dime el nombre de usuario");
                        String nuevoUsario = sc.nextLine();
                        if (!comprobarUsuario(usarios, nuevoUsario)){
                            break;
                        }
                        System.out.println("Dime la contraseña del nuevo usuario");
                        String nuevaPass = sc.nextLine();


                        boolean esCorrecta = false;

                        while(esCorrecta){
                            try{
                                esCorrecta = comprobarNuevaPass(nuevaPass);
                                System.out.println("Contraseña correcta");
                            } catch (PasswordException e) {
                                System.out.println(e.getTipoError());
                                System.out.println("Intentalo de nuevo");
                            }

                        }


                        try {
                            if (comprobarNuevaPass(nuevaPass)) {
                               try {
                                   addUser(usarios, nuevoUsario, nuevaPass);
                               }catch (Exception e){
                                   e.getMessage();
                               }
                            }
                        } catch (PasswordException e) {
                            System.out.println(e.getTipoError());
                        }

                        break;
                    case 5:
                        eliminarEvento(eventos);
                        break;
                }

            }while (opcion != 0);

        }else {
            System.out.println("Usuario no encontrado. Salida de la aplicación");
        }
    }

    private static boolean comprobarNuevaPass(String nuevaPass) throws PasswordException {

       //la contraseña debe cumplir las condicones de 8-12 con letras numeros y simbolos !=?¿

        String expresionRegular = "[a-zA-Z0-1]{8,12}";
        if(nuevaPass.matches(expresionRegular)){
            return true;
        }else {
            throw new PasswordException("Error en el sistema. Hable con el adminsitrador", TipoErrorPassword.ERROR_PASSWORD_LETRAS);
        }


    }

    private static boolean comprobarUsuario(HashMap<String, String> usarios, String nuevoUsario) {

        if(usarios.containsKey(nuevoUsario))
            return false;
        return true;
    }

    private static void addUser(HashMap<String, String> usarios, String nuevoUsario, String nuevaPass) throws Exception {

        if(nuevoUsario.equals("admin"))
            throw new Exception("Usuario invalido");

        usarios.put(nuevoUsario,nuevaPass);
    }

    private static void eliminarEvento(ArrayList<EventoImpl> eventos) {

        String nombreEventoEliminar = "Tareas Moodle";

        if(eventos.isEmpty())
            System.out.println("Lista de eventos vacia");
        else {

            for (int i = 0; i < eventos.size(); i++) {

                if (eventos.get(i).getNombre().equalsIgnoreCase(nombreEventoEliminar))
                    eventos.remove(i);

            }

        }

    }

    private static void mostrarEventos(ArrayList<EventoImpl> eventos) {

        for (EventoImpl e : eventos){
            e.mostrarInfo();
        }
    }

    private static void mostrarMenuAdmin() {
        System.out.println("Bienvenido a la app de EVENTOS: " +
                "\n\t1. Mostrar Eventos"+
                "\n\t2. Añadir Eventos"+
                "\n\t3. Añadir Usarios"+
                "\n\t4. Borrar Usarios"+
                "\n\t5. Borrar Eventos");
    }

    private static void mostrarMenu() {

        System.out.println("Bienvenido a la app de EVENTOS: " +
                "\n\t1. Mostrar Eventos"+
                "\n\t2. Añadir Eventos"+
                "\n\t3. Borrar Eventos");
    }

    private static void cargarUsuarios(HashMap<String, String> usarios) {
        usarios.put("admin", "1234");
    }

    private static boolean loguearse(String user, String pass, HashMap<String, String> usuarios) {

        if(usuarios.containsKey(user)){
            if(usuarios.get(user).equals(pass)){
                System.out.println("Login Correcto");
                return true;
            }else{
                System.out.println("Contraseña incorrecta");
                return false;
            }
        }else {
            return false;
        }

    }


}
