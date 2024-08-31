package controller;

import Service.JPAJugador;
import Service.JPAJugadorImpl;
import java.util.Scanner;
import model.Jugador;

public class Servidor {

    static int opcion = -1;
    private JPAJugador jugadorI;
    private Jugador jugador;

    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" JUGADOR CRUD ");
        System.out.println("------------------------------------------");
        System.out.println(
                "Seleccione una opcion: "
                + "\n1. Agregar Jugador"
                + "\n2. Buscar Jugador"
                + "\n3. Editar Jugador"
                + "\n4. Eliminar Jugador"
                + "\n5. Listar Jugadores"
                + "\n6. Salir");

        do {
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {

                case 1:
                    agregarJugador();
                    break;
                case 2:
                    buscarJugador();
                    break;
                case 3:
                    modificarJugador();
                    break;
                case 4:
                    eliminarJugador();
                    break;
                case 5:
                    listarJugadores();
                    break;
            }
        } while (opcion != 6);
    }

    public void agregarJugador() {
        this.jugadorI = new JPAJugadorImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("email : ");
        String email = scanner.nextLine();
        System.out.print("telefono : ");
        String telefono = scanner.nextLine();
        jugador = new Jugador(nombre, email, telefono);
        jugadorI.crear(jugador);
        System.out.println(" ");
        Menu();

    }

    public void listarJugadores() {
        this.jugadorI = new JPAJugadorImpl();
        jugadorI.mostrarTodos();
        Menu();
    }

    public void buscarJugador() {
        this.jugadorI = new JPAJugadorImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Ingrese el ID del jugador a buscar: ");
        int id = scanner.nextInt();
        System.out.println(" ");
        jugador = jugadorI.buscarId(id);
        if (jugador != null) {
            System.out.println("Jugador encontrado: " + jugador);
            System.out.println(" ");
        } else {
            System.out.println("Jugador no encontrado.");
            System.out.println(" ");
        }
        Menu();
    }

    public void modificarJugador() {
        this.jugadorI = new JPAJugadorImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el id del jugador a editar ");
        int id = scanner.nextInt();
        jugador = jugadorI.buscarId(id);
        if (jugador != null) {
            System.out.println(" ");
            System.out.println("Jugador encontrado: " + jugador);
            System.out.println(" ");
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Nuevo nombre del jugador: ");
            String nwNombre = scanner.nextLine();
            System.out.print("Nueva email del jugador: ");
            String nwEmail = scanner.nextLine();
            System.out.print("Nuevo telefono del jugador: ");
            String nwTelefono = scanner.nextLine();
            jugadorI.actualizar(nwNombre, nwEmail, nwTelefono, id);
        } else {
            System.out.println("Jugador no encontrado.");
        }
        Menu();
    }

    public void eliminarJugador() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del jugador a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        jugador = jugadorI.buscarId(id);
        if (jugador != null) {
            System.out.println(" ");
            System.out.println("Jugador encontrado: " + jugador);
            System.out.println(" ");
            System.out.print("Esta seguro que desea eliminar este jugador (s/n): ");
            String confirmacion = scanner.nextLine();
            if (confirmacion.equalsIgnoreCase("s")) {
                if (jugadorI.borrar(id)) {
                    System.out.println(" ");
                    System.out.println("Jugador eliminado exitosamente.");
                    System.out.println(" ");
                } else {
                    System.out.println("Error al eliminar el jugador.");
                }
            } else {
                System.out.println(" ");
                System.out.println("Eliminación cancelada.");
                System.out.println(" ");
            }
        } else {
            System.out.println(" ");
            System.out.println("Jugador no encontrado.");
            System.out.println(" ");
        }
        Menu();
    }
}
