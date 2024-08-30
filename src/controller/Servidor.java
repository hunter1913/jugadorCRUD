package controller;

import Service.JPAJugador;
import Service.JPAJugadorImpl;
import java.util.Scanner;
import model.Jugador;

public class Servidor {

    static int opcion = -1;
    private JPAJugador jugadorI;

    public void Menu() {

        System.out.println(
                "Seleccione una opcion: "
                + "\n1. Agregar Jugador"
                + "\n2. Buscar Jugador"
                + "\n3. Editar Jugador"
                + "\n4. Eliminar Jugador"
                + "\n5. Listar Jugadores"
                + "\n6. Salir");
        Scanner scanner = new Scanner(System.in);
        do {
            opcion = scanner.nextInt();

            scanner.nextLine();
            switch (opcion) {

                case 1:
                    agregarJugador();

                    break;
                case 2:
                    buscarJugador();
//                    mostrarMenu();
                case 3:
                    modificarJugador();

                    break;

                case 4:
//                    eliminarJugador();
//                    mostrarMenu();
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

        Jugador jugador = new Jugador(nombre, email, telefono);
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
           System.out.print("Ingrese el ID del jugador a buscar: ");
           int id = scanner.nextInt();
           jugadorI.buscarId(id);
           Menu();
           
    }
    
    public void modificarJugador(){
    this.jugadorI = new JPAJugadorImpl();
    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el id del jugador a editar ");
        int id = scanner.nextInt();
        jugadorI.buscarId(id);
        System.out.print("Nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("email : ");
        String email = scanner.nextLine();
        System.out.print("telefono : ");
        String telefono = scanner.nextLine();
    
    
    
    
    }
    
    
}
