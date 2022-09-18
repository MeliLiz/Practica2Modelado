/**
 * Clase que simula es estado cocinando de un robot todologo
 * 
 * @see EstadoRobot
 */
public class EstadoCocinando implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    // Codigo ascci para colores en terminal
    public static final String MORADO = "\033[0;95m";
    public static final String RESET = "\u001B[0m";

    /**
     * Constructor del Estado Atendiendo
     * 
     * @param robot El robot asociado al estado
     */
    public EstadoCocinando(RobotTodologo robot) {
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
     * No se puede suspender mientras cocina.
     */
    @Override
    public void suspender() {

        System.out.println(MORADO
                + "**MODO COCINANDO** \n el robot todologo no puede suspenderse si la orden no esta lista" + RESET);

    }

    /**
     * Metodo para que el robot camine.
     * 
     * No puede caminar mientras cocina.
     */
    @Override
    public void caminar() {
        System.out.println(MORADO + "**MODO COCINANDO** \n El robot todologo no puede caminar mientras cocina" + RESET);
    }

    /**
     * Metodo para que el robot atienda a un cliente
     * 
     * Si la orden del cliente ya esta lista, el robot pasara al estado de atender.
     * Si la orden del cliente no esta lista, no podra atender mientras cocina.
     */
    @Override
    public void atender() {
        if (robot.getOrdenLista()) {
            System.out.println(MORADO
                    + "**MODO COCINANDO**Su orden esta lista. El robot todologo pasara a ESTADO ATENDIENDO" + RESET);
            robot.setEstadoActual(robot.getEstadoAtendiendo());
        } else {
            System.out.println(
                    MORADO + "**MODO COCINANDO** \n El robot todologo no puede atender mientras cocina" + RESET);

        }
    }

    /**
     * Metodo para que el robot cocine
     * 
     * Si la orden del clienta esta lista, ya no podra seguir cocinando.
     * Si ya esta cocinando, ya no se podra poner a cocinar de nuevo.
     */
    @Override
    public void cocinar() {
        if (robot.getOrdenLista()) {
            System.out.println(MORADO
                    + "**MODO COCINANDO** \n El robot todologo ya tiene la orden del cliente lista, ya no puede cocinar."
                    + RESET);
        } else {
            System.out.println(MORADO + "**MODO COCINANDO** \n El robot todologo ya se encuentra cocinando" + RESET);
            robot.mostrarProceso();
        }

    }

    /**
     * Metodo para recibir la mesa y la distancia al cliente.
     * 
     * No puede recibir un cliente mientras cocina.
     */
    @Override
    public void recibirCliente() {
        System.out.println(
                MORADO + "**MODO COCINANDO**\n El robot todologo no puede recibir un cliente mientras cocina" + RESET);
    }
}