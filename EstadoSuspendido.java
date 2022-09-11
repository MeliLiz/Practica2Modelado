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

    }

    @Override
    public void caminar() {

    }

    @Override
    public void atender() {

    }

    @Override
    public void cocinar() {

    }
}