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
                System.out.println(" ");
                System.out.println("Jugador actualizado ");
                System.out.println(" ");
                break;
            }
        }

    }

    @Override
    public boolean borrar(int id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                jugadores.remove(jugador);
                return true;
            }
        }
        return false;
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
        System.out.println(" ");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("id : " + jugadores.get(i).getId());
            System.out.println("Nombre : " + jugadores.get(i).getNombre());
            System.out.println("Email : " + jugadores.get(i).getEmail());
            System.out.println("Telefono : " + jugadores.get(i).getTelefono());
            System.out.println("-------------------------------------");
        }
    }

}
