/**
 * Clase que simula el estado suspendido de un robot todologo
 * 
 * @see EstadoRobot
 */
public class EstadoSuspendido implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    // Codigo ascci para colores en terminal
    public static final String MORADO = "\033[0;95m";
    public static final String RESET = "\033[0m";

    /**
     * Constructor del Estado Suspendido
     * 
     * @param robot
     */
    public EstadoSuspendido(RobotTodologo robot) {
        this.robot = robot;
    }

    /**
     * Metodo para obtener el robot asociado a este estado
     * 
     * @return El robot asociado al estado
     */
    public RobotTodologo getRobot() {
        return robot;
    }

    /**
     * Metodo para asignar el robot asociado a este estado
     * 
     * 
     * @param robot El nuevo robot a asignar.
     */
    public void setRobot(RobotTodologo robot) {
        this.robot = robot;
    }

    /**
     * Metodo para suspender al robot.
     * 
     * Si la orden del cliente esta lista. el robot pasa a estado suspendido.
     * Si no, el robot ya se encuentra en estado Suspendido.
     */
    @Override
    public void suspender() {
        if (robot.getOrdenLista()) {
            System.out
                    .println(MORADO + "**ESTADO SUSPENDIDO** \n El robot todologo pasara al ESTADO SUSPENDIDO" + RESET);
        } else {
            System.out.println(
                    MORADO + "**ESTADO SUSPENDIDO** \n El robot todologo se encuentra suspendido, esperando un cliente"
                            + RESET);
        }
    }

    /**
     * Metodo para que el robot camine.
     * 
     * Si la orden del cliente esta lista, se pasara a modo suspendido.
     * Si el robot tiene un cliente por atender o si el robot todavia no
     * llega al cliente, el robot pasara al estado caminando.
     * Si el robot no tiene un cliente por atender, no podra caminar.
     */
    @Override
    public void caminar() {
        if (robot.getOrdenLista()) {// si el platillo del cliente esta listo
            System.out.println(MORADO
                    + "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO"
                    + RESET);
        } else if (robot.getClientePorAtender() != null && robot.getClientePorAtender().getDistancia() > 0) {
            System.out.println(MORADO + "**MODO SUSPENDIDO**\n El robot todologo se movera hacia el cliente" + RESET);
            robot.setEstadoActual(robot.getEstadoCaminando());
        } else {
            System.out.println(MORADO
                    + "**MODO SUSPENDIDO**\nEl robot todologo no puede caminar sin antes recibir a un cliente" + RESET);
        }
    }

    /**
     * Metodo para que el robot atienda a un cliente
     * 
     * Si la orden del cliente esta lista, pasara a estado suspendido.
     * En otro caso, no puede atender si esta suspendido
     */
    @Override
    public void atender() {
        if (robot.getOrdenLista()) {
            System.out.println(MORADO
                    + "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO"
                    + RESET);
        } else {
            System.out.println(
                    MORADO + "**ESTADO SUSPENDIDO**\n El robot toldologo no puede atender si esta en ESTADO SUSPENDIDO"
                            + RESET);
        }
    }

    /**
     * Metodo para que el robot cocine
     * 
     * Si la orden del cliente esta lista, pasara a estado suspendido.
     * En otro caso, no puede cocinar si esta suspendido
     */
    @Override
    public void cocinar() {
        if (robot.getOrdenLista()) {// Si la orden del cliente esta lista
            System.out.println(MORADO
                    + "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO"
                    + RESET);
        } else {
            System.out.println(
                    MORADO + "**ESTADO SUSPENDIDO**\n El robot toldologo no puede cocinar si esta en ESTADO SUSPENDIDO"
                            + RESET);
        }
    }

    /**
     * Metodo para recibir la mesa y la distancia al cliente.
     * 
     * Pasa al estado recibir cliente
     */
    @Override
    public void recibirCliente() {
        System.out.println(MORADO + "**MODO SUSPENDIDO**\n El robot todologo pasara al estado RECIBIR CLIENTE" + RESET);
        robot.setEstadoActual(robot.getEstadoRecibirCliente());
    }

}