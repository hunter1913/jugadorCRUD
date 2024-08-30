
package Service;

import java.util.List;
import model.Jugador;


public interface JPAJugador {
        /*Interfaz que contendrá los métodos abtractos(CRUD)
    *que se implementarán en la clase JPAUsersImpl
     */

    public void crear(String body);
    public List<Jugador>  readAll();
    public void actualizar(String body, int id);
    public void borrar(int id);
    public void buscar(int id);
}
