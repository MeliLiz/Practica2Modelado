/**
 * Clase para simular el item de un menu
 */
public class MenuItem {

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
    public MenuItem(int id, String nombrePlatillo, String descripcion, double precio, boolean tieneQueso,
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
}