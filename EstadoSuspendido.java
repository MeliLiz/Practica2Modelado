/**
 * Clase que simula el estado suspendido de un robot todologo
 */
public class EstadoSuspendido implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

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
        if (robot.getOrdenLista()) {
            System.out.println("**ESTADO SUSPENDIDO** \n El robot todologo pasara al ESTADO SUSPENDIDO");
        } else {
            System.out.println(
                    "**ESTADO SUSPENDIDO** \n El robot todologo se encuentra suspendido, esperando un cliente");

        }

    }

    @Override
    public void caminar() {
        if (robot.getOrdenLista()) {
            System.out.println(
                    "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO");
        } else if (robot.getClientePorAtender() != null) {
            System.out.println("**MODO SUSPENDIDO**\n El robot todologo se movera hacia el cliente");
            robot.setEstadoActual(robot.getEstadoCaminando());
        }

    }

    @Override
    public void atender() {
        if (robot.getOrdenLista()) {
            System.out.println(
                    "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO");
        } else {
            System.out
                    .println(
                            "**ESTADO SUSPENDIDO**\n El robot toldologo no puede atender si esta en ESTADO SUSPENDIDO");
        }

    }

    @Override
    public void cocinar() {
        if (robot.getOrdenLista()) {
            System.out.println(
                    "**ESTADO SUSPENDIDO** \n El robot todologo ha terminado de cocinar, pasara a ESTADO SUSPENDIDO");
        } else {
            System.out
                    .println(
                            "**ESTADO SUSPENDIDO**\n El robot toldologo no puede cocinar si esta en ESTADO SUSPENDIDO");
        }
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