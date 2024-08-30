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
    public void crear(String nombre, String email, String telefono) {
        jugador = new Jugador(0, nombre, email, telefono);
        jugadores.add(jugador);
        System.out.println("Jugador creado = " + jugador);

    }

    @Override
    public List<Jugador> mostrarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(String nombre, String email, String telefono, int id) {
        
         for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                jugador.setNombre(nombre);
                jugador.setEmail(email);
                jugador.setTelefono(telefono);
                jugadores.set(id, jugador);
                //user.setId(id);//reconfirmamos  el id
                break;
            }
        }
        
        
    }

    @Override
    public void borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
