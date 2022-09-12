/**
 * Clase que simula es estado atendiendo de un robot todologo
 */
public class EstadoAtendiendo implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    /**
     * Constructor del Estado Atendiendo
     * 
     * @param robot
     */
    public EstadoAtendiendo(RobotTodologo robot) {
        this.robot = robot;
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

    @Override
    public void suspender() {
        System.out.println("**ESTADO ATENDIENDO** \n El robot todologo no puede suspenderse mientras esta atendiendo");

    }

    @Override
    public void caminar() {
        System.out.println("**ESTADO ATENDIENDO** \n El robot todologo no puede caminar mientras esta atendiendo");
    }

    @Override
    public void atender() {
        System.out.println("**ESTADO ATENDIENDO** \n El robot todologo ya esta atendiendo");
        robot.mostrarMenu();
    }

    @Override
    public void cocinar() {
        if (robot.getOrdenRecibida()) {
            System.out.println("**ESTADO ATENDIENDO** \n El robot todologo pasara al ESTADO COCINANDO");
            robot.setEstadoActual(robot.getEstadoCocinando());
        } else {
            System.out.println(
                    "**ESTADO ATENDIENDO** \n El robot todologo no puede cocinar si no ha recibido la orden completa del cliente");
        }

    }
}