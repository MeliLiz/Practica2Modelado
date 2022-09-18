import java.util.Scanner;

public class EstadoRecibirCliente implements EstadoRobot {

    private RobotTodologo robot;
    /**
     * codigo ascci para colores en terminal
     */
    public static final String MORADO = "\033[0;95m";
    public static final String RESET = "\033[0m";

    public EstadoRecibirCliente(RobotTodologo robot) {
        this.robot = robot;
    }

    @Override
    public void suspender() {
        System.out.println(
                MORADO + "**MODO RECICBIR CLIENTE**\n El robot todologo no de puede suspender mientras recibe un cliente"
                        + RESET);

    }

    @Override
    public void caminar() {
        if (robot.getClientePorAtender() == null || robot.getClientePorAtender().getDistancia() == 0) {
            System.out.println(
                    MORADO + "**MODO RECIBIR CLIENTE**\n El robot todologo no puede caminar antes de recibir al cliente"
                            + RESET);
        } else {
            System.out.println(
                    MORADO + "**MODO RECIBIR CLIENTE**\n El robot todologo pasara a ESTADO CAMINANDO para llegar a la mesa del cliente"
                            + RESET);
            robot.setEstadoActual(robot.getEstadoCaminando());
        }
    }

    @Override
    public void atender() {
        System.out.println(
                MORADO + "**ESTADO RECIBIR CLIENTE** \n El robot todologo no puede atender mientras recibe a un cliente"
                        + RESET);

    }

    @Override
    public void cocinar() {
        System.out.println(
                MORADO + "**ESTADO RECIBIR CLIENTE** \n El robot todologo no puede cocinar mientras recibe a un cliente"
                        + RESET);
    }

    @Override
    public void recibirCliente() {
        if (robot.getClientePorAtender() == null || robot.getClientePorAtender().getDistancia() == 0) {
            System.out.println(MORADO + "**ESTADO RECIBIR CLIENTE** \n Recibiendo cliente" + RESET);
            robot.setCliente();
            System.out.println(MORADO + "El robot ha recibido al cliente" + RESET);
        } else {
            System.out.println(
                    MORADO + "**MODO RECIBIR CLIENTE**\n El robot ya tiene un cliente esperando ser atendido, no puede recibir mas clientes."
                            + RESET);
        }

    }
}
