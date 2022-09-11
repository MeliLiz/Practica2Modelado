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