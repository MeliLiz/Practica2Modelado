import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RobotTodologo robot=new RobotTodologo();
        Scanner scanner=new Scanner(System.in);
        int opcion;

        System.out.println("**Bienvenido a McBurguesas** ");
        do{
            System.out.println("\nPor favor elige una opcion (ingrese el numero)"
            + "que deseas ejecutar.\n" + 
            "1) Recibir cliente.\n" +
            "2) Caminar.\n" + 
            "3) Atender.\n" + 
            "4) Cocinar.\n" +
            "5) Suspender.\n" +
            "0) Terminar simulacion.\n");
            while (true){
                try {
                    String respuesta = scanner.nextLine();
                    opcion = Integer.parseInt(respuesta);
                    break;
                }catch (NumberFormatException ex){
                   System.out.println("No ingresaste un numero");
                }
            }
            switch(opcion){
                case 1:
                    robot.recibirCliente();
                    break;

                case 2:
                    robot.caminar();
                    break;

                case 3:
                    robot.atender();
                    break;

                case 4:
                    robot.cocinar();
                    break;

                case 5:
                    robot.suspender();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nLa opcion que elegiste no es valida. Por favor elige la opcion que deseas ejecutar.");
                    break;

            }
        }while(opcion != 0);
    }
}
