import javax.annotation.processing.SupportedOptions;

/**
 * Clase que simula es estado caminando de un robot todologo
 */
public class EstadoCaminando implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    /**
     * Constructor del Estado Caminando
     * 
     * @param robot
     */
    public EstadoCaminando(RobotTodologo robot) {
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
        System.out.println("**ESTADO CAMINANDO**\n El robot todologo pasara a ESTADO SUSPENDIDO");
    }

    @Override
    public void caminar() {
        if (!robot.getMesaCorrecta()) {
            robot.reducirDistancia();
            System.out.println("**ESTADO CAMINANDO** \n El robot todologo se esta acercando al cliente");
        } else {
            System.out.println("**ESTADO CAMINANDO** \n El robot todologo ya se encuentra en la mesa del cliente");
        }
    }

    @Override
    public void atender() {
        if (!robot.getMesaCorrecta()) {
            System.out.println(
                    "**ESTADO CAMINANDO** \n El robot todologo no puede atender sin haber llegado a la mesa del cliente");
        } else {
            System.out.println("**ESTADO CAMINANDO** \n El robot todologo pasara al ESTADO ATENDER");
            robot.setEstadoActual(robot.getEstadoAtendiendo());
        }
    }

    @Override
    public void cocinar() {
        System.out.println("**ESTADO CAMINANDO** \n El robot todologo no puede cocinar sin antes atender al cliente");
    }
}