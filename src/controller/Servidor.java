package controller;

import Service.JPAJugador;
import Service.JPAJugadorImpl;
import java.util.Scanner;
import model.Jugador;

public class Servidor {

    static int opcion = -1;
    private JPAJugador jugador2;

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
//                    mostrarMenu();
                    break;
                case 2:
//                    buscarJugador();
//                    mostrarMenu();
                case 3:
//                    modificarJugador();
//                    mostrarMenu();
                    break;

                case 4:
//                    eliminarJugador();
//                    mostrarMenu();
                    break;

                case 5:
//                    listarJugadores();
//                    mostrarMenu();
                    break;
            }
        } while (opcion != 5);
    }

    public void agregarJugador() {
        
        this.jugador2 = new JPAJugadorImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("email : ");
        String email = scanner.nextLine();
        System.out.print("telefono : ");
        String telefono = scanner.nextLine();
        
        Jugador jugador1 = new Jugador(nombre, email, telefono);
        jugador2.crear(jugador1);
        
        
        
    }
    
    
    
}
