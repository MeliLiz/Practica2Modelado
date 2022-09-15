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
        if(robot.getOrdenLista()){
            System.out.println("**ESTADO ATENDIENDO**\n Entregando la "+robot.getClientePorAtender().getPedido().getNombre()+". El robot pasara al ESTADO SUSPENDIDO");
            robot.setEstadoActual(robot.getEstadoSuspendido());
        }else if(!robot.getOrdenRecibida()){
            System.out.println("**ESTADO ATENDIENDO** \n El robot todologo ya esta atendiendo");
            robot.mostrarMenu();
            System.out.println("El robot todologo ha recibido la orden del cliente");
        }else{
            System.out.println("**ESTADO ATENDIENDO** \nEl robot ya tiene una orden pendiente, no puede recibir otra orden");
        }
    }

    @Override
    public void cocinar() {
        if (robot.getOrdenRecibida()) {
            System.out.println("**ESTADO ATENDIENDO** \n El robot todologo pasara al ESTADO COCINANDO");
            robot.setEstadoActual(robot.getEstadoCocinando());
        } else if(robot.getOrdenLista()){
            System.out.println("**ESTADO ATENDIENDO**\n El robot todologo ya no puede cocinar. Tiene una orden esperando ser entregada.");
        }else{
            System.out.println("**ESTADO ATENDIENDO** \n El robot todologo no puede cocinar si no ha recibido la orden completa del cliente");
        }
    }

    @Override
    public void recibirCliente() {
        System.out.println("ESTADO ATENDIENDO**\n El robot todologo no puede recibir un cliente mientras atiende");
    }
}