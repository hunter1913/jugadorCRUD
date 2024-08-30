
package Service;

import java.util.List;
import model.Jugador;


public interface JPAJugador {
        /*Interfaz que contendrá los métodos abtractos(CRUD)
    *que se implementarán en la clase JPAUsersImpl
     */

    public void crear(String nombre, String email, String telefono);
    public List<Jugador>  mostrarTodos();
    public void actualizar(String nombre, String email, String telefono, int id);
    public void borrar(int id);
    public void buscarId(int id);
}
