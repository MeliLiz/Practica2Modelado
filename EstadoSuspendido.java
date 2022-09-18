/**
 * Clase que simula el estado suspendido de un robot todologo
 * @see EstadoRobot
 */
public class EstadoSuspendido implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    //Codigo ascci para colores en terminal
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

    @Override
    public void suspender() {
        if (robot.getOrdenLista()) {//si el platillo del cliente esta listo
            System.out.println(MORADO + "**ESTADO SUSPENDIDO** \n El robot todologo pasara al ESTADO SUSPENDIDO" + RESET);
        } else {
            System.out.println(MORADO + "**ESTADO SUSPENDIDO** \n El robot todologo se encuentra suspendido, esperando un cliente"+ RESET);
        }
    }

    @Override
    public void caminar() {
        if (robot.getOrdenLista()) {//si el platillo del cliente esta listo
            System.out.println(MORADO + "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO"+ RESET);
        } else if (robot.getClientePorAtender() != null && robot.getClientePorAtender().getDistancia() > 0) {//si no hay cliente o no hay distancia para caminar
            System.out.println(MORADO + "**MODO SUSPENDIDO**\n El robot todologo se movera hacia el cliente" + RESET);
            robot.setEstadoActual(robot.getEstadoCaminando());
        } else {
            System.out.println(MORADO + "**MODO SUSPENDIDO**\nEl robot todologo no puede caminar sin antes recibir a un cliente" + RESET);
        }
    }

    @Override
    public void atender() {
        if (robot.getOrdenLista()) {//Si el platillo del cliente esta listo
            System.out.println(MORADO + "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO"+ RESET);
        } else {
            System.out.println(MORADO + "**ESTADO SUSPENDIDO**\n El robot toldologo no puede atender si esta en ESTADO SUSPENDIDO"+ RESET);
        }
    }

    @Override
    public void cocinar() {
        if (robot.getOrdenLista()) {//Si la orden del cliente esta lista
            System.out.println(MORADO + "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO" + RESET);
        } else {
            System.out.println(MORADO + "**ESTADO SUSPENDIDO**\n El robot toldologo no puede cocinar si esta en ESTADO SUSPENDIDO"+ RESET);
        }
    }

    @Override
    public void recibirCliente() {
        System.out.println(MORADO + "**MODO SUSPENDIDO**\n El robot todologo pasara al estado RECIBIR CLIENTE" + RESET);
        robot.setEstadoActual(robot.getEstadoRecibirCliente());
    }

    /**
     * Metodo para obtener el robot asociado a este estado
     * 
     * @return
     */
    public RobotTodologo getRobot() {
        return robot;
    }

    /**
     * Metodo para asignar el robot asociado a este estado
     * 
     * @return
     */
    public void setRobot(RobotTodologo robot) {
        this.robot = robot;
    }

}