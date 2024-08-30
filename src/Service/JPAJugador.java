
package Service;

import java.util.List;
import model.Jugador;


public interface JPAJugador {
        /*Interfaz que contendrá los métodos abtractos(CRUD)
    *que se implementarán en la clase JPAUsersImpl
     */

    public void create(String body);
    public List<Jugador>  readAll();
    public void updateById(String body, int id);
    public void deleteById(int id);
    public void findAll();
    public void findById(int id);
}
