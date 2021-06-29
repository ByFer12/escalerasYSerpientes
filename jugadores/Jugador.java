package jugadores;

public class Jugador {

    private int Id;
    private String Nombre;
    private String Apellido;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;

    public Jugador(int Id, String Nombre, String Apellido) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

}
