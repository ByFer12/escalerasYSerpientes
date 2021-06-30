/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jugadores.Jugador;

public class JugadorGuadrdado {

    private File archivo;

    //Metodo para crear el archivo usando la clase File
    public void crearArchivo() {
        archivo = new File("agendaContactos.txt");
        try {
            if (archivo.createNewFile()) {

            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crear\n el archivo");
        }
    }

    //Lectura de datos de o llenado de datos de los jugadores en     un archivo
    public void llenarArchivo(Jugador persona) {

        try {
            FileWriter insertando = new FileWriter(archivo, true);
            insertando.write(persona.getNombre() + "%" + persona.getApellido() + "%" + persona.getId() + "%" + "\r\n");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo llenar\n el archivo");
        }
    }

}
