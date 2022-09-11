/**
 * Clase del menu general de McBurguesas
 */
public class MenuGeneral implements Menu {

    private MenuItem[] menuItems;
    private final int ITEMS_MAXIMOS;
    private int numeroDeItems;

    /**
     * Constructor
     * 
     * @param maxDeItems //El numero maximo de items que se podra tener en el menu
     */
    public MenuGeneral(int maxDeItems) {
        menuItems = new MenuItem[maxDeItems];
        ITEMS_MAXIMOS = maxDeItems;
        numeroDeItems = 0;
    }

    /**
     * Metodo para obtener el arreglo de items del menu
     * 
     * @return MenuItem[]
     */
    public MenuItem[] getItems() {
        return menuItems;
    }

    /**
     * Metodo para asignar el arreglo de items del menu
     * 
     * @param items
     */
    public void setItems(MenuItem[] items) {
        menuItems = items;
    }

    /**
     * Metodo para obtener el numero maximo de menus
     * 
     * @return int
     */
    public int getMaximoDeItems() {
        return ITEMS_MAXIMOS;
    }

    /**
     * Metodo para obtener el numero de items en el menu
     * 
     * @return int
     */
    public int getNumeroDeItems() {
        return numeroDeItems;
    }

    /**
     * Metodo para agregar items al mennu
     * 
     * @param item
     */
    public void addItem(MenuItem item) {

    }

    @Override
    public MenuIterador crearIterador() {
        return null;// cambiar
    }
}