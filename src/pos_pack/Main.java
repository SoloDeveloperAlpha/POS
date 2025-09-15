package pos_pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Tarea> tareas = new ArrayList<>(); //Creacion de La lista de Tareas

    public static void main(String[] args) {
        int opcion = -1;

        while (opcion != 3) {
            System.out.println("\n ***** MENÚ PRINCIPAL *****");//Menu Principal
            System.out.println("1-> Registrar usuario");
            System.out.println("2-> Login");
            System.out.println("3-> Salir");
            System.out.print("Seleccione una opción: ");

            //Verificar si la opcion ingresada es un numero valido para la entrada al menu
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        registrarUsuario();
                        break;
                    case 2:
                        login();
                        break;
                    case 3:
                        System.out.println(" Saliendo del sistema...");
                        break;
                    default:
                        System.out.println(" Opción inválida. Intente de nuevo.");
                }
            } else {
                // Caso Contrario
                System.out.println("Debe ingresar un número. Volviendo al menú...");
                scanner.nextLine(); 
            }
        }
    }

    // Método para registrar un nuevo usuario
    public static void registrarUsuario() {
        System.out.println("\n **** REGISTRAR USUARIO ****");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Nickname: ");
        String nickname = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Usuario nuevo = new Usuario(nombre, apellido, nickname, email);
        usuarios.add(nuevo);

        System.out.println(" Usuario registrado EXITOSAMENTE: " + nuevo.getNickname());
    }

    // Método de login
    public static void login() {
        if (usuarios.isEmpty()) {
            System.out.println(" No hay usuarios registrados. REGISTRATE PRIMERO");
            return;
        }

        System.out.println("\n **** LOGIN ****");
        System.out.print("Ingresa tu nickname: ");
        String inputNickname = scanner.nextLine();

        System.out.print("Ingresa tu email: ");
        String inputEmail = scanner.nextLine();

        // Buscar usuario
        for (Usuario u : usuarios) {
            if (u.getNickname().equals(inputNickname) && u.getEmail().equals(inputEmail)) {
                System.out.println(" BIENVENIDO, " + u.getNombre() + " " + u.getApellido());

                // Ahora pasamos al siguiente MENU
                Menu_Proy.mostrarMenu(u, usuarios, tareas);
                return;
            }
        }

        System.out.println(" CREDENCIALES INCORRECTAS.");
    }
}
