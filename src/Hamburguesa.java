/**
 * Clase para simular el item de un menu
 */
public abstract class Hamburguesa {

    private int id;
    private String nombreHamburguesa;
    private String descripcion;
    private double precio;
    private boolean tieneQueso;
    private boolean vegetariano;

    // Codigo ascii para colores en terminal
    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    /**
     * Constructor de un platillo
     * 
     * @param id                El id de la Hamburguesa
     * @param nombreHamburguesa EL nombre de la Hamburguesa
     * @param descripcion       La descripcion de la Hamburguesa
     * @param precio            El precio de la Hamburguesa
     * @param tieneQueso        Si la Hamburguesa tiene queso
     * @param vegetariano       Si la Hamburguesa es vegetariano
     */
    public Hamburguesa(int id, String nombreHamburguesa, String descripcion, double precio, boolean tieneQueso,
            boolean vegetariano) {
        this.id = id;
        this.nombreHamburguesa = nombreHamburguesa;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.vegetariano = vegetariano;
    }

    /**
     * Metodo para obtener el id de la Hamburguesa
     * 
     * @return El id de la Hamburguesa
     */
    public int getID() {
        return id;
    }

    /**
     * Metodo para obtener el nombre de la Hamburguesa
     * 
     * @return el nombre de la Hamburguesa
     */
    public String getNombre() {
        return nombreHamburguesa;
    }

    /**
     * Metodo para obtener la descripcion de la Hamburguesa
     * 
     * @return La descripcion de la Hamburguesa
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para obtener el precio de la Hamburguesa
     * 
     * @return El precio de la Hamburguesa
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo para saber la Hamburguesa tiene queso
     * 
     * @return Si la Hamburguesa tiene queso
     */
    public boolean tieneQueso() {
        return tieneQueso;
    }

    /**
     * Metodo para saber si la Hamburguesa es vegetariana
     * 
     * @return Si la Hamburguesa es vegetariana
     */
    public boolean esVegetariana() {
        return vegetariano;
    }

    /**
     * Metodo para asignar un id a la Hamburguesa
     * 
     * @param id El nuevo id de la Hamburguesa
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Metodo para asignar un nuevo nombre a la Hamburguesa
     * 
     * @param nombre El nuevo nombre de la Hamburguesa
     */
    public void setNombre(String nombre) {
        nombreHamburguesa = nombre;
    }

    /**
     * Metodo para asignar la descripcion a la Hamburguesa
     * 
     * @param descripcion La nueva descripcion de la Hamburguesa
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para asignar el precio de la Hamburguesa
     * 
     * @param precio El nuevo precio de la Hamburguesa
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para modificar si la Hamburguesa tiene queso
     * 
     * @param queso El booleano para que la Hamburguesa ahora lleve queso o no
     */
    public void setTieneQueso(boolean queso) {
        tieneQueso = queso;
    }

    /**
     * Metodo para modificar si la Hamburguesa es vegeteriana
     * 
     * @param vegetariano El booleano para que la Hamburguesa ahora sea vegetariana
     *                    o no
     */
    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    /**
     * Metodo para preparar una hamburguesa
     * Los pasos a seguir son iguales en todas las hamburgesas
     */
    public void prepararHamburguesa() {
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
    public void ponerPanDeAbajo() {
        System.out.println("Poniendo la base del pan");
    }

    /**
     * Metodo para poner al pan de arriba a una hamburguesa
     */
    public void ponerPanDeArriba() {
        System.out.println("Poniedo la tapa a la hamburguesa");
    }

    /**
     * Metodo para poner la mayonesa a la hamburguesa
     */
    public void ponerMayonesa() {
        System.out.println("Poniendo mayonesa");
    }

    /**
     * Metodo para poner sobres de mostaza en la orden de hamburguesa
     */
    public void ponerMostaza() {
        System.out.println("Poniendo mostaza");
    }

    /**
     * Metodo para poner la carne en la hamburguesa
     */
    public void ponerCarne() {
        System.out.println("Poniendo la carne");
    }

    /**
     * Metodo para poner sobres de catsup en la orden de hamburguesa
     */
    public void ponerCatsup() {
        System.out.println("Poniendo catsup");
    }

    /**
     * Metodo para preparar la carne de la hamburguesa
     */
    public abstract void prepararCarne();

    /**
     * Metodo para poner queso a la hamburguesa
     */
    public abstract void ponerQueso();

    /**
     * Metodo para poner vegetales en la hamburguesa
     */
    public abstract void ponerVegetales();

    /**
     * Metodo que regresa una cadena con todos los datos de la Hamburguesa
     */
    @Override
    public String toString() {
        String platillo = "ID: " + id + " " + nombreHamburguesa + " $" + precio + "\n " + VERDE + descripcion + RESET;
        return platillo;
    }

}