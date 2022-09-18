import java.util.Scanner;

/**
 * Clase que simula a un robot de McBurguesas
 */
public class RobotTodologo {

    private boolean ordenRecibida;// si ya se recibio una orden del cliente
    private Cliente clientePorAtender;// el cliente que se atendera
    private boolean mesaCorrecta;// si el robot esta en la mesa del cliente que se atendera
    private boolean ordenLista;// si la comida del cliente esta lista
    private EstadoRobot estadoActual; // el estado actual del robot
    /**
     * Los diferentes estados del robot
     */
    private EstadoRobot modoSuspendido;
    private EstadoRobot modoCaminando;
    private EstadoRobot modoAtendiendo;
    private EstadoRobot modoCocinando;
    private EstadoRobot modoRecibirCliente;

    private MenusMcBurguesas menus;// Los menus disponibles

    /**
     * Codigo ascii para colores en terminal
     */
    public static final String ROJO = "\033[0;31m";
    public static final String RESET = "\033[0m";

    /**
     * Constructor de un robot
     */
    public RobotTodologo() {
        ordenRecibida = false;
        mesaCorrecta = false;
        ordenLista = false;
        modoSuspendido = new EstadoSuspendido(this);
        modoCaminando = new EstadoCaminando(this);
        modoAtendiendo = new EstadoAtendiendo(this);
        modoCocinando = new EstadoCocinando(this);
        modoRecibirCliente = new EstadoRecibirCliente(this);
        menus = new MenusMcBurguesas();
        estadoActual = modoSuspendido;
    }

    /**
     * Metodo para saber si el robot ha recibido una orden
     * 
     * @return Si el robot ha recibido una orden
     */
    public boolean getOrdenRecibida() {
        return ordenRecibida;
    }

    /**
     * Metodo para saber si el robot ya llego a la mesa que debe atender
     * 
     * @return Si el robot ya llego a la mesa que debe atender
     */
    public boolean getMesaCorrecta() {
        if (clientePorAtender.getDistancia() > 0) {
            return mesaCorrecta;
        } else {
            mesaCorrecta = true;
            return mesaCorrecta;
        }
    }

    /**
     * Metodo que regresa el cliente por atender.
     * 
     * @return El cliente por atender.
     */
    public Cliente getClientePorAtender() {
        return clientePorAtender;
    }

    /**
     * Metodo para saber si la orden del cliente esta lista
     * 
     * @return Si la orden del cliente esta lista
     */
    public boolean getOrdenLista() {
        return ordenLista;
    }

    /**
     * Metodo para obtener el estado actual del robot
     * 
     * @return Estado actual del robot
     */
    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    /**
     * Metodo para obtener el estado suspendido del robot
     * 
     * @return EstadoSuspendido del robot
     */
    public EstadoRobot getEstadoSuspendido() {
        return modoSuspendido;
    }

    /**
     * Metodo para obtener el estado caminando del robot
     * 
     * @return EstadoCaminando del robot
     */
    public EstadoRobot getEstadoCaminando() {
        return modoCaminando;
    }

    /**
     * Metodo para obtener el estado atendiendo del robot
     * 
     * @return EstadoAtendiendo del robot
     */
    public EstadoRobot getEstadoAtendiendo() {
        return modoAtendiendo;
    }

    /**
     * Metodo para obtener el estado cocinando del robot
     * 
     * @return EstadoCocinando del robot
     */
    public EstadoRobot getEstadoCocinando() {
        return modoCocinando;
    }

    /**
     * Metodo para obtener el estado recibir cliente del robor
     * 
     * @return EstadoRecibirCliente del robot
     */
    public EstadoRobot getEstadoRecibirCliente() {
        return modoRecibirCliente;
    }

    /**
     * Metodo para asignar si el robot recibio la orden o no
     * 
     * @param recibida true si la orden fue recibida, false en otro caso
     */
    public void setOrdenRecibida(boolean recibida) {
        ordenRecibida = recibida;
    }

    /**
     * Metodo asignar si el robot ya esta en la mesa correcta
     * 
     * @param mesaCorrecta true si ya esta en la mesa correcta, false en otro caso
     */
    public void setMesaCorrecta(boolean mesaCorrecta) {
        this.mesaCorrecta = mesaCorrecta;
    }

    /**
     * Metodo para asignar si el robot ya tiene la orden lista del cliente
     * 
     * @param ordenLista true si la orden del cliente esta lista, false en otro caso
     */
    public void setOrdenLista(boolean ordenLista) {
        this.ordenLista = ordenLista;
    }

    /**
     * Metodo para asignar el estado actual del robot
     * 
     * @param estado El estado actual del robot
     */
    public void setEstadoActual(EstadoRobot estado) {
        estadoActual = estado;
    }

    /**
     * Metodo para asignar el estado suspendido del robot
     * 
     * @param estado El estado suspendido del robot
     */
    public void setEstadoSuspendido(EstadoSuspendido estado) {
        modoSuspendido = estado;
    }

    /**
     * Metodo para asignar el estado caminando del robot
     * 
     * @param estado El estado caminando del robot
     */
    public void setEstadoCaminando(EstadoCaminando estado) {
        modoCaminando = estado;
    }

    /**
     * Metodo para asignar el estado atendiendo del robot
     * 
     * @param estado El estado atendiendo del robot
     */
    public void setEstadoAtendiendo(EstadoAtendiendo estado) {
        modoAtendiendo = estado;
    }

    /**
     * Metodo para asignar el estado cocinando del robot
     * 
     * @param estado El estado cocinando del robot
     */
    public void setEstadoCocinando(EstadoCocinando estado) {
        modoCocinando = estado;
    }

    /**
     * Metodo para recibir el cliente que se atendera
     * 
     * @param distanciaAlCliente La distancia que tendra el robot ocn respecto al
     *                           cliente
     */
    public void recibirClientePorAtender(int distanciaAlCliente) {
        clientePorAtender = new Cliente(distanciaAlCliente);
    }

    /**
     * Metodo para reducir la distancia hacia el cliente que se atendera
     */
    public void reducirDistancia() {
        clientePorAtender.setDistancia(clientePorAtender.getDistancia() - 1);
    }

    /**
     * Metodo para que el robot se suspenda
     */
    public void suspender() {
        estadoActual.suspender();
    }

    /**
     * Metodo para que el robot camine
     */
    public void caminar() {
        estadoActual.caminar();
    }

    /**
     * Metodo para que el robot atienda a un cliente
     */
    public void atender() {
        estadoActual.atender();

    }

    /**
     * Metodo para que el robot cocine
     */
    public void cocinar() {
        estadoActual.cocinar();
    }

    /**
     * Metodo para que el robot reciba un cliente
     */
    public void recibirCliente() {
        estadoActual.recibirCliente();
    }

    /**
     * Metodo para mostrar los menus disponibles y obtener la orden del cliente
     * Se le pide el id del platillo al usuario, manda mensajes de errores en caso
     * de cometerlos.
     */
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int respuesta = 0;
        while (respuesta == 0) {
            menus.mostrarMenu();
            System.out.print("\nIngresa el id del platillo de tu eleccion: ");
            System.out.println();
            try {
                respuesta = Integer.parseInt(scanner.nextLine());
                Hamburguesa hamburguesa = menus.buscarPlatillo(respuesta);
                if (hamburguesa != null) {
                    clientePorAtender.setPedido(hamburguesa);
                    ordenRecibida = true;
                } else {
                    System.out.println(ROJO + "El id del platillo que elegiste no es valido" + RESET);
                    respuesta = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println(ROJO + "No ingresaste un numero" + RESET);
            }
        }

    }

    /**
     * Metodo para mostrar el proceso de preparacion del pedido del cliente
     */
    public void mostrarProceso() {
        System.out.println("Preparando " + clientePorAtender.getPedido().getNombre());
        Hamburguesa hamburguesa = clientePorAtender.getPedido();
        hamburguesa.prepararHamburguesa();
        setOrdenLista(true);
    }

    /**
     * Metodo para recibir la distancia hasta un nuevo cliente por atender
     * Se le pide al usuario que ingrese la distancia, manda errores en caso de
     * cometerlos
     */
    public void setCliente() {
        Scanner scanner = new Scanner(System.in);
        int respuesta = 0;
        while (respuesta == 0) {
            System.out.print("Por favor ingresa la distancia al cliente (numero entre 1 y 10): ");
            try {
                respuesta = Integer.parseInt(scanner.nextLine());
                if (respuesta < 1 || respuesta > 10) {
                    System.out.println(ROJO + "\nIngresa un numero del 1 al 10\n" + RESET);
                    respuesta = 0;
                } else {
                    recibirClientePorAtender(respuesta);
                    mesaCorrecta = false;
                    ordenRecibida = false;
                    ordenLista = false;
                }
            } catch (NumberFormatException e) {
                System.out.println(ROJO + "\nNo se ingreso un numero, vuelva a intentar\n" + RESET);
            }
        }
    }

}