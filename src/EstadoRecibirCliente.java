/**
 * Clase que simula el estado de recibir cliente del robot
 * 
 * @see EstadoRobot
 */
public class EstadoRecibirCliente implements EstadoRobot {

    private RobotTodologo robot;

    // codigo ascci para colores en terminal
    public static final String MORADO = "\033[0;95m";
    public static final String RESET = "\033[0m";

    /**
     * Constructor
     * 
     * @param robot El robot asociado
     */
    public EstadoRecibirCliente(RobotTodologo robot) {
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
     * No se puede suspender mientras recibe un cliente.
     */
    @Override
    public void suspender() {
        System.out.println(MORADO
                + "**MODO RECICBIR CLIENTE**\n El robot todologo no de puede suspender mientras recibe un cliente"
                + RESET);
    }

    /**
     * Metodo para que el robot camine.
     * 
     * Si el robot no tiene un cliente por atender, o si la distancia del robot al
     * cliente es 0, no podra caminar.
     * En otro caso, el robot pasara al estado caminando.
     */
    @Override
    public void caminar() {
        if (robot.getClientePorAtender() == null || robot.getClientePorAtender().getDistancia() == 0) {
            System.out.println(
                    MORADO + "**MODO RECIBIR CLIENTE**\n El robot todologo no puede caminar antes de recibir al cliente"
                            + RESET);
        } else {
            System.out.println(MORADO
                    + "**MODO RECIBIR CLIENTE**\n El robot todologo pasara a ESTADO CAMINANDO para llegar a la mesa del cliente"
                    + RESET);
            robot.setEstadoActual(robot.getEstadoCaminando());
        }
    }

    /**
     * Metodo para que el robot atienda a un cliente
     * 
     * No puede atender mientras recibe un cliente.
     */
    @Override
    public void atender() {
        System.out.println(
                MORADO + "**ESTADO RECIBIR CLIENTE** \n El robot todologo no puede atender mientras recibe a un cliente"
                        + RESET);
    }

    /**
     * Metodo para que el robot cocine
     * 
     * No puede cocinar mientras recibe un cliente.
     */
    @Override
    public void cocinar() {
        System.out.println(
                MORADO + "**ESTADO RECIBIR CLIENTE** \n El robot todologo no puede cocinar mientras recibe a un cliente"
                        + RESET);
    }

    /**
     * Metodo para recibir la mesa y la distancia al cliente.
     * 
     * Si no hay cliente por atender o no hay mas distancia que recorrer hacia el
     * cliente, se asigna un cliente al robot
     */
    @Override
    public void recibirCliente() {
        if (robot.getClientePorAtender() == null || robot.getClientePorAtender().getDistancia() == 0) {
            System.out.println(MORADO + "**ESTADO RECIBIR CLIENTE** \n Recibiendo cliente" + RESET);
            robot.setCliente();
            System.out.println(MORADO + "El robot ha recibido al cliente" + RESET);
        } else {
            System.out.println(MORADO
                    + "**MODO RECIBIR CLIENTE**\n El robot ya tiene un cliente esperando ser atendido, no puede recibir mas clientes."
                    + RESET);
        }
    }
}
