package Service;

import java.util.List;
import model.Jugador;

public interface JPAJugador {

    public void crear(Jugador jugador);

    public List<Jugador> mostrarTodos();

    public void actualizar(String nombre, String email, String telefono, int id);

    public boolean borrar(int id);

    public Jugador buscarId(int id);
}
