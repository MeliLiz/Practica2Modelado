/**
 * Clase que simula es estado atendiendo de un robot todologo
 * 
 * @see EstadoRobot
 */
public class EstadoAtendiendo implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    // Codigo ascci para colores en terminal
    public static final String MORADO = "\033[0;95m";
    public static final String RESET = "\u001B[0m";

    /**
     * Constructor del Estado Atendiendo
     * 
     * @param robot El robot asociado al estado
     */
    public EstadoAtendiendo(RobotTodologo robot) {
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
     * @param robot El nuevo robot a asignar.
     */
    public void setRobot(RobotTodologo robot) {
        this.robot = robot;
    }

    /**
     * Metodo para suspender al robot.
     * 
     * No puede suspenderse mientras atiende.
     */
    @Override
    public void suspender() {
        System.out.println(MORADO
                + "**ESTADO ATENDIENDO** \n El robot todologo no puede suspenderse mientras esta atendiendo" + RESET);

    }

    /**
     * Metodo para que el robot camine.
     * 
     * No puede caminar mientras atiende.
     */
    @Override
    public void caminar() {
        System.out.println(MORADO
                + "**ESTADO ATENDIENDO** \n El robot todologo no puede caminar mientras esta atendiendo" + RESET);
    }

    /**
     * Metodo para que el robot atienda a un cliente
     * 
     * Si la orden del cliente esta lista, el robot pasa a modo suspendido.
     * Si no ha recibido una orden, seguira mostrando el menu
     * Si ya recibio una orden, no podra seguir atendiendo
     */
    @Override
    public void atender() {
        if (robot.getOrdenLista()) {
            System.out.println(MORADO + "**ESTADO ATENDIENDO**\n Entregando la "
                    + robot.getClientePorAtender().getPedido().getNombre() + ". El robot pasara al ESTADO SUSPENDIDO"
                    + RESET);
            robot.setEstadoActual(robot.getEstadoSuspendido());
        } else if (!robot.getOrdenRecibida()) {
            System.out.println(MORADO + "**ESTADO ATENDIENDO** \n El robot todologo ya esta atendiendo" + RESET);
            robot.mostrarMenu();
            System.out.println(MORADO + "El robot todologo ha recibido la orden del cliente" + RESET);
        } else {
            System.out.println(MORADO
                    + "**ESTADO ATENDIENDO** \nEl robot ya tiene una orden pendiente, no puede recibir otra orden"
                    + RESET);
        }
    }

    /**
     * Metodo para que el robot cocine
     * 
     * Si el robot ha recibido la orden del cliente, pasara al estado cocinar.
     * Si la orden del cliente ya esta lista, ya no podrá cocinar.
     * Si no ha recibido una orden del cliente, no puede cocinar.
     */
    @Override
    public void cocinar() {
        if (robot.getOrdenRecibida()) {
            System.out
                    .println(MORADO + "**ESTADO ATENDIENDO** \n El robot todologo pasara al ESTADO COCINANDO" + RESET);
            robot.setEstadoActual(robot.getEstadoCocinando());
        } else if (robot.getOrdenLista()) {
            System.out.println(MORADO
                    + "**ESTADO ATENDIENDO**\n El robot todologo ya no puede cocinar. Tiene una orden esperando ser entregada."
                    + RESET);
        } else {
            System.out.println(MORADO
                    + "**ESTADO ATENDIENDO** \n El robot todologo no puede cocinar si no ha recibido la orden completa del cliente"
                    + RESET);
        }
    }

    /**
     * Metodo para recibir la mesa y la distancia al cliente.
     * 
     * No puede recibir un cliente mientras atiende.
     */
    @Override
    public void recibirCliente() {
        System.out.println(MORADO
                + "ESTADO ATENDIENDO**\n El robot todologo no puede recibir un cliente mientras atiende" + RESET);
    }
}