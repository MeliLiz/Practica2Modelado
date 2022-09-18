/**
 * Clase para simular a un cliente
 */
public class Cliente {

    private int distanciaAlCliente;
    private Hamburguesa pedido;

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

    /**
     * Metodo para asignar el pedido del cliente
     * @param hamburguesa
     */
    public void setPedido(Hamburguesa hamburguesa){
        pedido=hamburguesa;
    }

    /**
     * Metodo para obtener el pedido del cliente
     * @return
     */
    public Hamburguesa getPedido(){
        return pedido;
    }
}