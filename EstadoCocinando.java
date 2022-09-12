import javax.annotation.processing.SupportedOptions;

/**
 * Clase que simula es estado cocinando de un robot todologo
 */
public class EstadoCocinando implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    /**
     * Constructor del Estado Cocinando
     * 
     * @param robot
     */
    public EstadoCocinando(RobotTodologo robot) {
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

        System.out.println("**MODO COCINANDO** \n el robot todologo no puede suspenderse si la orden no esta lista");

    }

    @Override
    public void caminar() {
        System.out.println("**MODO COCINANDO** \n El robot todologo no puede caminar mientras cocina");
    }

    @Override
    public void atender() {
        System.out.println("**MODO COCINANDO** \n El robot todologo no puede atender mientras cocina");

    }

    @Override
    public void cocinar() {
        if (robot.getOrdenLista()) {
            System.out.println(
                    "**MODO COCINANDO** \n El robot todologo ha terminado de cocinar, la orden esta lista, pasara a ESTADO SUSPENDIDO");
            robot.setEstadoActual(robot.getEstadoSuspendido());
        } else {
            System.out.println("**MODO COCINANDO** \n El robot todologo ya se encuentra cocinando");

        }

    }
}