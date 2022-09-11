/**
 * Clase para simular a un cliente
 */
public class Cliente {

    private int distanciaAlCliente;

    /**
     * Constructor
     * 
     * @param distancia La distancia hasta el cliente
     */
    public Cliente(int distancia) {
        distanciaAlCliente = distancia;
    }

    /**
     * Metodo para obtener la distancia al cliente
     * 
     * @return
     */
    public int getDistancia() {
        return distanciaAlCliente;
    }

    /**
     * Metodo para asignar la distancia al cliente
     * 
     * @param distancia
     */
    public void setDistancia(int distancia) {
        distanciaAlCliente = distancia;
    }
}