package jugadores;

import javax.swing.JOptionPane;

public class VectorJugador {
    private static int nJugadores;

    public static void setnJugadores(int nJugadores) {
        VectorJugador.nJugadores = nJugadores;
    }
    
    private static Jugador [] jugadores=new Jugador[nJugadores];
    
    public static void ingresoDatos(String nombre,String apellido,int id){
        for(int i=0; i<jugadores.length;i++){
            jugadores[i]=new Jugador(nombre,apellido,id);
            
        }
        
    }

    public static int getnJugadores() {
        return nJugadores;
    }
    
    

    

    

}
