package model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Andretty
 */
public class Jugador {

    private final int id;
    private String nombre;
    private String email;
    private String telefono;
    private static int contadorJugadores;

    public Jugador() {
        this.id = ++Jugador.contadorJugadores;

    }

    public Jugador(String nombre, String email, String telefono) {
        this();
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public Jugador(int id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
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
