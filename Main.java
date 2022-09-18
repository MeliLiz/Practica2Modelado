import java.util.Scanner;

public class Main {
    /**
     * Codigo ascii para colores en terminal
     */
    public static final String ROJO = "\033[0;31m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {

        RobotTodologo robot = new RobotTodologo(); // el robot que hara todo el trabajo
        Scanner scanner = new Scanner(System.in); // Scanner para las opciones del usuario
        int opcion;

        System.out.println("**Bienvenido a McBurguesas** ");
        do {
            System.out.println("\nPor favor elige una opcion (ingrese el numero)"
                    + "que deseas ejecutar.\n" +
                    "1) Recibir cliente.\n" +
                    "2) Caminar.\n" +
                    "3) Atender.\n" +
                    "4) Cocinar.\n" +
                    "5) Suspender.\n" +
                    "0) Terminar simulacion.\n");
            while (true) {
                try {
                    System.out.print("Ingrese una opcion: ");
                    String respuesta = scanner.nextLine();
                    opcion = Integer.parseInt(respuesta);
                    System.out.println();
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println(ROJO + "No ingresaste un numero" + RESET);
                }
            }
            switch (opcion) {
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
                    System.out.println(
                            ROJO + "\nLa opcion que elegiste no es valida. Por favor elige la opcion que deseas ejecutar."
                                    + RESET);
                    break;

            }
        } while (opcion != 0);
    }
}
