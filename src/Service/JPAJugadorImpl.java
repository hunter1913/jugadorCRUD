/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import java.util.List;
import model.Jugador;

/**
 *
 * @author Andretty
 */
public class JPAJugadorImpl implements JPAJugador {

    private static List<Jugador> jugadores = new ArrayList<Jugador>();
    public static Jugador jugador;

    @Override
    public void crear(Jugador jugador) {
//        jugador = new Jugador(nombre, email, telefono);
        jugadores.add(jugador);
        System.out.println(" ");
        System.out.println("Jugador agregado = " + jugador);

    }

    @Override
    public List<Jugador> mostrarTodos() {
        printJugadores(jugadores);
        return jugadores;
    }

    @Override
    public void actualizar(String nombre, String email, String telefono, int id) {
        jugador = buscarId(id);
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                jugador.setNombre(nombre);
                jugador.setEmail(email);
                jugador.setTelefono(telefono);
                System.out.println("Jugador actualizado ");
                break;
            }
        }

    }

    @Override
    public void borrar(int id) {
        boolean encontrado = false;
        jugadores.removeIf(p -> p.getId() == id);
        System.out.println("Se ha eliminado el usuario con Id:" + id);
        printJugadores(jugadores);
    }

    @Override
    public Jugador buscarId(int id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                return jugador;
            }
        }
        return null;
    }

    static void printJugadores(List<Jugador> jugadores) {
        System.out.println("Lista de jugadores:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("\n{\n\t\"id\":" + jugadores.get(i).getId() + "," + "\n\t\"nombre\":" + jugadores.get(i).getNombre() + "\","
                    + "\n\t\"email\":" + "\"" + jugadores.get(i).getEmail() + "\",\n\t\"telefono\":" + "\"" + jugadores.get(i).getTelefono() + "\"\n\t\t\t\t\t\t},");
        }
    }

}
