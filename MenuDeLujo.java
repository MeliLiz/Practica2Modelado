import java.util.Hashtable;

/**
 * Clase del menu de lujo de McBurguesas
 */
public class MenuDeLujo implements Menu {

    private Hashtable<Integer, MenuItem> menuItems;

    /**
     * Constructor
     */
    public MenuDeLujo() {
        menuItems = new Hashtable<Integer, MenuItem>();
    }

    /**
     * Metodo para obtener los items del menu
     * 
     * @return
     */
    public Hashtable<Integer, MenuItem> getmenuItems() {
        return menuItems;
    }

    /**
     * Metodo para asignar items al menu
     * 
     * @param items
     */
    public void setItems(Hashtable<Integer, MenuItem> items) {
        menuItems = items;
    }

    /**
     * Metodo para agregar items al mennu
     * 
     * @param item
     */
    public void addItem(MenuItem item) {

    }

    /**
     * Metodo para eliminar items al mennu
     * 
     * @param item
     */
    public void eliminarItem(MenuItem item) {

    }

    @Override
    public MenuIterador crearIterador() {
        return null;// cambiar
    }
}