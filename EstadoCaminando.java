/**
 * Clase que simula es estado caminando de un robot todologo
 * 
 * @see EstadoRobot
 */
public class EstadoCaminando implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    // Codigo ascci para colores en terminal
    public static final String MORADO = "\033[0;95m";
    public static final String RESET = "\u001B[0m";

    /**
     * Constructor del Estado Atendiendo
     * 
     * @param robot El robot asociado al estado
     */
    public EstadoCaminando(RobotTodologo robot) {
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
     * Se puede suspender mientras camina.
     */
    @Override
    public void suspender() {
        System.out.println(MORADO + "**ESTADO CAMINANDO**\n El robot todologo pasara a ESTADO SUSPENDIDO" + RESET);
        robot.setEstadoActual(robot.getEstadoSuspendido());
    }

    /**
     * Metodo para que el robot camine.
     * 
     * Si el robot no ha llegado a la mesa del cliente, reduce la distancia a la
     * mesa del cliente.
     * Si ya ha llegado, se imprime un mesaje de que ya ha llegado.
     */
    @Override
    public void caminar() {
        if (!robot.getMesaCorrecta()) {
            robot.reducirDistancia();
            System.out
                    .println(MORADO + "**ESTADO CAMINANDO** \n El robot todologo se esta acercando al cliente" + RESET);
        } else {
            System.out.println(MORADO
                    + "**ESTADO CAMINANDO** \n El robot todologo ya se encuentra en la mesa del cliente, ya no puede caminar mas."
                    + RESET);
        }
    }

    /**
     * Metodo para que el robot atienda a un cliente
     * 
     * Si el robot todavia no llega a la mesa del cliente, no puede atender.
     * Si ya ha llegado, pasara a modo atender
     */
    @Override
    public void atender() {
        if (!robot.getMesaCorrecta()) {
            System.out.println(MORADO
                    + "**ESTADO CAMINANDO** \n El robot todologo no puede atender sin haber llegado a la mesa del cliente"
                    + RESET);
        } else {
            System.out.println(MORADO + "**ESTADO CAMINANDO** \n El robot todologo pasara al ESTADO ATENDER" + RESET);
            robot.setEstadoActual(robot.getEstadoAtendiendo());
        }
    }

    /**
     * Metodo para que el robot cocine
     * 
     * El robot no puede cocinar mientras camina
     */
    @Override
    public void cocinar() {
        System.out.println(MORADO
                + "**ESTADO CAMINANDO** \n El robot todologo no puede cocinar sin antes atender al cliente" + RESET);
    }

    /**
     * Metodo para recibir la mesa y la distancia al cliente.
     * 
     * No puede recibir un cliente mientras camina.
     */
    @Override
    public void recibirCliente() {
        System.out.println(
                MORADO + "**ESTADO CAMINANDO**\n El robot todologo no puede recibir clientes mientras camina" + RESET);
    }
}