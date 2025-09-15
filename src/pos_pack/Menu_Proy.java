package pos_pack;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu_Proy {
    private static Scanner scanner = new Scanner(System.in);

    // Método principal del menú admin
    public static void mostrarMenu(Usuario user, ArrayList<Usuario> usuarios, ArrayList<Tarea> tareas) {
        int opcion = 0;
        do {
            System.out.println("\n **** MENU PROY (" + user.getNickname() + ") ****");
            System.out.println("1 -> Ver usuarios registrados");
            System.out.println("2 -> Crear tarea");
            System.out.println("3 -> Ver tareas");
            System.out.println("4 -> Cerrar sesión");
            System.out.print("Elige una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer
            } else {
                System.out.println("PORFAVOR ,  Ingresa un número válido.");
                scanner.nextLine(); // limpiar entrada inválida
                continue; 
            }

            switch (opcion) {
                case 1:
                    verUsuarios(usuarios);
                    break;
                case 2:
                    crearTarea(user, tareas, scanner);
                    break;
                case 3:
                    verTareas(tareas);
                    break;
                case 4:
                    System.out.println(" CERRANDO SESION . . . .");
                    break;
                default:
                    System.out.println("OPCION INVALIDA . . . ");
            }
        } while (opcion != 4);
    }

    // Mostrar lista de usuarios
    private static void verUsuarios(ArrayList<Usuario> usuarios) {
        System.out.println("\n **** LISTA DE USUARIOS **** ");

        // Encabezado Tabla
        System.out.printf("%-15s %-15s %-15s %-25s\n",
                "Nombre", "Apellido", "Nickname", "Email");
        System.out.println("--------------------------------------------------------------------------");

        // Filas con datos de tabla
        for (Usuario u : usuarios) {
            System.out.printf("%-15s %-15s %-15s %-25s\n",
                    u.getNombre(),
                    u.getApellido(),
                    u.getNickname(),
                    u.getEmail());
        }
    }

    // Crear tarea
    private static void crearTarea(Usuario user, ArrayList<Tarea> tareas, Scanner sc) {
        System.out.println("\n **** CREAR NUEVA TAREA **** ");

        System.out.print("Título de la tarea: ");
        String titulo = sc.nextLine();

        System.out.print("Descripción de la tarea: ");
        String descripcion = sc.nextLine();

        System.out.print("Estado inicial (Pendiente / En progreso / Completada): ");
        String estado = sc.nextLine();

        LocalDateTime fechaHora = LocalDateTime.now();

        // Crear y agregar la tarea
        Tarea nueva = new Tarea(titulo, descripcion, estado, user, fechaHora);
        tareas.add(nueva);

        System.out.println("✅ Tarea creada con éxito.");
    }

    // Ver todas las tareas
    private static void verTareas(ArrayList<Tarea> tareas) {
    System.out.println("\n **** LISTA DE TAREAS ****");

    if (tareas.isEmpty()) {
        System.out.println("NO HAY TAREAS REGISTRADAS");
        return;
    }

    // Encabezado de la tabla
    System.out.printf("%-5s %-20s %-15s %-15s %-20s %-40s%n", 
            "ID", "TÍTULO", "ESTADO", "USUARIO", "CREADA", "DESCRIPCIÓN");
    System.out.println("---------------------------------------------------------------------------------------------------------------");

    // Formato de fecha
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // Mostrar cada tarea con índice
    int id = 1;
    for (Tarea t : tareas) {
        System.out.printf("%-5d %-20s %-15s %-15s %-20s %-40s%n",
                id,
                t.getTitulo(),
                t.getEstado(),
                (t.getUsuario() != null ? t.getUsuario().getNickname() : "Desconocido"),
                t.getCreatedAt().format(formato),
                t.getDescripcion()
        );
        id++;
    }
}

}
