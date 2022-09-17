/**
 * Interfaz de los estados del robot de McBurquesas
 */
public interface EstadoRobot {

    /**
     * Metodo para suspender al robot
     */
    public void suspender();

    /**
     * Metodo para que el robot camine
     */
    public void caminar();

    /**
     * Metodo para que el robot atienda a un cliente
     */
    public void atender();

    /**
     * Metodo para que el robot cocine
     */
    public void cocinar();

    /**
     * Metodo para recibir la mesa y la distancia al cliente
     */
    public void recibirCliente();
}