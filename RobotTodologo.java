/**
 * Clase que simula a un robot de McBurguesas
 */
public class RobotTodologo {

    private boolean ordenRecibida;// si ya se recibio una orden del cliente
    private Cliente clientePorAtender;// el cliente que se atendera
    private boolean mesaCorrecta;// si el robot esta en la mesa del cliente que se atendera
    private boolean ordenLista;// si la comida del cliente esta lista
    private EstadoRobot estadoActual;
    private EstadoRobot modoSuspendido;
    private EstadoRobot modoCaminando;
    private EstadoRobot modoAtendiendo;
    private EstadoRobot modoCocinando;
    private MenusMcBurguesas menus;// Los menus disponibles

    /**
     * Constructor de un robot
     */
    public RobotTodologo() {
        ordenRecibida = false;
        mesaCorrecta = false;
        ordenLista = false;
        modoSuspendido = new EstadoSuspendido(this);
        modoCaminando = new EstadoCaminando(this);
        modoAtendiendo = new EstadoAtendiendo(this);
        modoCocinando = new EstadoCocinando(this);
        menus=new MenusMcBurguesas();
        estadoActual = modoSuspendido;
    }

    /**
     * Metodo para saber si el robot ha recibido una orden
     * 
     * @return boolean
     */
    public boolean getOrdenRecibida() {
        return ordenRecibida;
    }

    /**
     * Metodo para saber si el robot ya llego a la mesa que debe atender
     * 
     * @return boolean
     */
    public boolean getMesaCorrecta() {
        if (clientePorAtender.getDistancia() > 0) {
            return mesaCorrecta;
        } else {
            mesaCorrecta = true;
            return mesaCorrecta;
        }
    }

    /**
     * Metodo que regresa el cliente por atender.
     * 
     * @return El cliente por atender.
     */
    public Cliente getClientePorAtender() {
        return clientePorAtender;
    }

    /**
     * Metodo para saber si la orden del cliente esta lista
     * 
     * @return boolean
     */
    public boolean getOrdenLista() {
        return ordenLista;
    }

    /**
     * Metodo para obtener el estado actual del robot
     * 
     * @return EstadoRobot
     */
    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    /**
     * Metodo para obtener el estado suspendido del robot
     * 
     * @return EstadoRobot
     */
    public EstadoRobot getEstadoSuspendido() {
        return modoSuspendido;
    }

    /**
     * Metodo para obtener el estado caminando del robot
     * 
     * @return EstadoRobot
     */
    public EstadoRobot getEstadoCaminando() {
        return modoCaminando;
    }

    /**
     * Metodo para obtener el estado atendiendo del robot
     * 
     * @return EstadoRobot
     */
    public EstadoRobot getEstadoAtendiendo() {
        return modoAtendiendo;
    }

    /**
     * Metodo para obtener el estado cocinando del robot
     * 
     * @return EstadoRobot
     */
    public EstadoRobot getEstadoCocinando() {
        return modoCocinando;
    }

    /**
     * Metodo para asignar si el robot recibio la orden o no
     * 
     * @param recibida true si la orden de recibio, false en otro caso
     */
    public void setOrdenRecibida(boolean recibida) {
        ordenRecibida = recibida;
    }

    /**
     * Metodo asignar si el robot ya esta en la mesa correcta
     * 
     * @param mesaCorrecta true si ya esta en la mesa correcta, false en otro caso
     */
    public void setMesaCorrecta(boolean mesaCorrecta) {
        this.mesaCorrecta = mesaCorrecta;
    }

    /**
     * Metodo para asignar si el robot ya tiene la orden lista del cliente
     * 
     * @param ordenLista true si la orden del cliente esta lista, false en otro caso
     */
    public void setOrdenLista(boolean ordenLista) {
        this.ordenLista = ordenLista;
    }

    /**
     * Metodo para asignar el estado actual del robot
     * 
     * @param estado El estado actual del robot
     */
    public void setEstadoActual(EstadoRobot estado) {
        estadoActual = estado;
    }

    /**
     * Metodo para asignar el estado suspendido del robot
     * 
     * @param estado
     */
    public void setEstadoSuspendido(EstadoSuspendido estado) {
        modoSuspendido = estado;
    }

    /**
     * Metodo para asignar el estado caminando del robot
     * 
     * @param estado
     */
    public void setEstadoCaminando(EstadoCaminando estado) {
        modoCaminando = estado;
    }

    /**
     * Metodo para asignar el estado atendiendo del robot
     * 
     * @param estado
     */
    public void setEstadoAtendiendo(EstadoAtendiendo estado) {
        modoAtendiendo = estado;
    }

    /**
     * Metodo para asignar el estado cocinando del robot
     * 
     * @param estado
     */
    public void setEstadoCocinando(EstadoCocinando estado) {
        modoCocinando = estado;
    }

    /**
     * Metodo para recibir el cliente que se atendera
     * 
     * @param cliente
     */
    public void recibirClientePorAtender(Cliente cliente) {
        clientePorAtender = cliente;
    }

    /**
     * Metodo para reducir la distancia hacia el cliente que se atendera
     */
    public void reducirDistancia() {
        clientePorAtender.setDistancia(clientePorAtender.getDistancia() - 1);
    }

    /**
     * Metodo para que el robot se suspenda
     */
    public void suspender() {
        estadoActual.suspender();
    }

    /**
     * Metodo para que el robot camine
     */
    public void caminar() {
        estadoActual.caminar();
    }

    /**
     * Metodo para que el robot atienda a un cliente
     */
    public void atender() {
        estadoActual.atender();

    }

    /**
     * Metodo para que el robot cocine
     */
    public void cocinar() {
        estadoActual.cocinar();
    }

    /**
     * Metodo para mostrar los menus disponibles
     */
    public void mostrarMenu() {
        menus.mostrarMenu();
    }

    /**
     * Metodo para mostrar el proceso de preparacion del pedido del cliente
     */
    private void mostrarProceso() {

    }

}