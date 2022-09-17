/**
 * Clase para simular el item de un menu
 */
public abstract class Hamburguesa {

    //Colores en la terminal
    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    private int id;
    private String nombrePlatillo;
    private String descripcion;
    private double precio;
    private boolean tieneQueso;
    private boolean vegetariano;

    /**
     * Constructor
     * 
     * @param id
     * @param nombrePlatillo
     * @param descripcion
     * @param precio
     * @param tieneQueso
     * @param vegetariano
     */
    public Hamburguesa(int id, String nombrePlatillo, String descripcion, double precio, boolean tieneQueso,
            boolean vegetariano) {
        this.id = id;
        this.nombrePlatillo = nombrePlatillo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.vegetariano = vegetariano;
    }

    /**
     * Obtener el id del item
     * 
     * @return int
     */
    public int getID() {
        return id;
    }

    /**
     * Obtener el nombre del item
     * 
     * @return String
     */
    public String getNombre() {
        return nombrePlatillo;
    }

    /**
     * Obtener la descripcion del item
     * 
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtener el precio del item
     * 
     * @return double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo para saber si el platillo tiene queso
     * 
     * @return boolean
     */
    public boolean tieneQueso() {
        return tieneQueso;
    }

    /**
     * Metodo para saber si el item es vegetariano
     * 
     * @return boolean
     */
    public boolean esVegetariana() {
        return vegetariano;
    }

    /**
     * Metodo para asignar un id al platillo
     * 
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Metodo para asignar el nombre del platillo
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        nombrePlatillo = nombre;
    }

    /**
     * Metodo para asignar la descripcion del platillo
     * 
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para asignar el precio del platillo
     * 
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para determinar si el platillo tiene queso
     * 
     * @param queso
     */
    public void setTieneQueso(boolean queso) {
        tieneQueso = queso;
    }

    /**
     * Metodo para determinar si el platillo es vegetariano
     * 
     * @param vegetariano
     */
    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    /**
     * Metodo patra preparar una hamburguesa
     */
    public void prepararHamburguesa(){
        prepararCarne();
        ponerPanDeAbajo();
        ponerMayonesa();
        ponerCarne();
        ponerQueso();
        ponerVegetales();
        ponerPanDeArriba();
        ponerCatsup();
        ponerMostaza();
    }

    /**
     * Metodo para poner el pan de abajo a una hamburguesa
     */
    public void ponerPanDeAbajo(){
        System.out.println("Poniendo la base del pan");
    }

    /**
     * Metodo para poner al pan de arriba a una hamburguesa
     */
    public void ponerPanDeArriba(){
        System.out.println("Poniedo la tapa a la hamburguesa");
    }

    /**
     * Metodo para poner la mayonesa a la hamburguesa
     */
    public void ponerMayonesa(){
        System.out.println("Poniendo mayonesa");
    }

    /**
     * Metodo para poner sobres de mostaza en la orden de hamburguesa
     */
    public void ponerMostaza(){
        System.out.println("Poniendo sobres de mostaza");
    }

    /**
     * Metodo para poner la carne en la hamburguesa
     */
    public void ponerCarne(){
        System.out.println("Poniendo la carne");
    }

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    public abstract void ponerVegetales();

    /**
     * Metodo para poner sobres de catsup en la orden de hamburguesa
     */
    public void ponerCatsup(){
        System.out.println("Poniendo sobres de catsup");
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    public abstract void prepararCarne();

    /**
     * Metodo para poner queso a la hamburguesa
     */
    public abstract void ponerQueso();

    @Override
    public String toString(){
        String platillo="ID: "+id+" "+nombrePlatillo+" $"+precio +"\n "+VERDE+descripcion+RESET;
        return platillo;
    }

}