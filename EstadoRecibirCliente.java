import java.util.Scanner;

public class EstadoRecibirCliente implements EstadoRobot{

    private RobotTodologo robot;

    public EstadoRecibirCliente(RobotTodologo robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        System.out.println("**MODO RECICBIR CLIENTE**\n El robot todologo no de puede suspender mientras recibe un cliente");
        
    }

    @Override
    public void caminar() {
        if(robot.getClientePorAtender()==null || robot.getClientePorAtender().getDistancia()==0){
            System.out.println("**MODO RECIBIR CLIENTE**\n El robot todologo no puede caminar antes de recibir al cliente");
        }else{
            System.out.println("**MODO RECIBIR CLIENTE**\n El robot todologo pasara a ESTADO CAMINANDO para llegar a la mesa del cliente");
            robot.setEstadoActual(robot.getEstadoCaminando());
        } 
    }

    @Override
    public void atender() {
        System.out.println("**ESTADO RECIBIR CLIENTE** \n El robot todologo no puede atender mientras recibe a un cliente");
        
    }

    @Override
    public void cocinar() {
        System.out.println("**ESTADO RECIBIR CLIENTE** \n El robot todologo no puede cocinar mientras recibe a un cliente");
    }

    @Override
    public void recibirCliente() {
        if(robot.getClientePorAtender()==null||robot.getClientePorAtender().getDistancia()==0){
            System.out.println("**ESTADO RECIBIR CLIENTE** \n Recibiendo cliente");
            robot.setCliente();
            System.out.println("El robot ha recibido al cliente");
        }else{
            System.out.println("**MODO RECIBIR CLIENTE**\n El robot ya tiene un cliente esperando ser atendido, no puede recibir mas clientes.");
        }
        
    }
}
