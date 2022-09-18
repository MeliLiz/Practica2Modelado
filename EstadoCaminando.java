/**
 * Clase que simula es estado caminando de un robot todologo
 * @see EstadoRobot
 */
public class EstadoCaminando implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    //Colores en la terminal
    public static final String MORADO = "\033[0;95m";
    public static final String RESET = "\u001B[0m";

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
        System.out.println(MORADO+"**ESTADO CAMINANDO**\n El robot todologo pasara a ESTADO SUSPENDIDO"+RESET);
    }

    @Override
    public void caminar() {
        if (!robot.getMesaCorrecta()) {//si el robot no ha llegado a la mesa del cliente
            robot.reducirDistancia();
            System.out.println(MORADO+"**ESTADO CAMINANDO** \n El robot todologo se esta acercando al cliente"+RESET);
        } else {
            System.out.println(MORADO+"**ESTADO CAMINANDO** \n El robot todologo ya se encuentra en la mesa del cliente, ya no puede caminar mas."+RESET);
        }
    }

    @Override
    public void atender() {
        if (!robot.getMesaCorrecta()) {//si el robot no ha llegado a la mesa del cliente
            System.out.println(MORADO+"**ESTADO CAMINANDO** \n El robot todologo no puede atender sin haber llegado a la mesa del cliente"+RESET);
        } else {
            System.out.println(MORADO+"**ESTADO CAMINANDO** \n El robot todologo pasara al ESTADO ATENDER"+RESET);
            robot.setEstadoActual(robot.getEstadoAtendiendo());
        }
    }

    @Override
    public void cocinar() {
        System.out.println(MORADO+"**ESTADO CAMINANDO** \n El robot todologo no puede cocinar sin antes atender al cliente"+RESET);
    }

    @Override
    public void recibirCliente() {
        System.out.println(MORADO+"**ESTADO CAMINANDO**\n El robot todologo no puede recibir clientes mientras camina"+RESET);
    }
}