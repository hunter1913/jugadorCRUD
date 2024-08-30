
package model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Andretty
 */
public class Jugador {
    private static final AtomicInteger count = new AtomicInteger(0);
    private   int id=0;
    private String nombre;
    private String email;
    private String telefono;

    public Jugador(int id,String nombre, String email, String telefono) {
        this.id = count.incrementAndGet();
        //this.setId(id++);//sino se le asigna el id, el id siempre será el mismo
        //User.id=id;//incrementamos el id automaticamente cada vez que se cree un nuevo usuario
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + '}';
    }


        
}
