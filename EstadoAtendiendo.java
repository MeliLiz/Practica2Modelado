/**
 * Clase que simula es estado atendiendo de un robot todologo
 * @see EstadoRobot
 */
public class EstadoAtendiendo implements EstadoRobot {

    private RobotTodologo robot;// El robot asociado

    //Colores en la terminal
    public static final String MORADO = "\033[0;95m";
    public static final String RESET = "\u001B[0m";

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
        System.out.println(MORADO+"**ESTADO ATENDIENDO** \n El robot todologo no puede suspenderse mientras esta atendiendo"+RESET);

    }

    @Override
    public void caminar() {
        System.out.println(MORADO+"**ESTADO ATENDIENDO** \n El robot todologo no puede caminar mientras esta atendiendo"+RESET);
    }

    @Override
    public void atender() {
        if(robot.getOrdenLista()){//si el platillo del cliente ya esta listo
            System.out.println(MORADO+"**ESTADO ATENDIENDO**\n Entregando la "+robot.getClientePorAtender().getPedido().getNombre()+". El robot pasara al ESTADO SUSPENDIDO"+RESET);
            robot.setEstadoActual(robot.getEstadoSuspendido());
        }else if(!robot.getOrdenRecibida()){//si el robot no ha recibido una orden del cliente
            System.out.println(MORADO+"**ESTADO ATENDIENDO** \n El robot todologo ya esta atendiendo"+RESET);
            robot.mostrarMenu();
            System.out.println(MORADO+"El robot todologo ha recibido la orden del cliente"+RESET);
        }else{
            System.out.println(MORADO+"**ESTADO ATENDIENDO** \nEl robot ya tiene una orden pendiente, no puede recibir otra orden"+RESET);
        }
    }

    @Override
    public void cocinar() {
        if (robot.getOrdenRecibida()) {//si el robot ya recibio la orden del cliente
            System.out.println(MORADO+"**ESTADO ATENDIENDO** \n El robot todologo pasara al ESTADO COCINANDO"+RESET);
            robot.setEstadoActual(robot.getEstadoCocinando());
        } else if(robot.getOrdenLista()){//si el platillo del cliente ya esta listo
            System.out.println(MORADO+"**ESTADO ATENDIENDO**\n El robot todologo ya no puede cocinar. Tiene una orden esperando ser entregada."+RESET);
        }else{
            System.out.println(MORADO+"**ESTADO ATENDIENDO** \n El robot todologo no puede cocinar si no ha recibido la orden completa del cliente"+RESET);
        }
    }

    @Override
    public void recibirCliente() {
        System.out.println(MORADO+"ESTADO ATENDIENDO**\n El robot todologo no puede recibir un cliente mientras atiende"+RESET);
    }
}