import java.util.Hashtable;

/**
 * Clase del menu de lujo de McBurguesas
 */
public class MenuDeLujo implements Menu {

    private Hashtable<Integer, Hamburguesa> menuItems;

    /**
     * Constructor
     */
    public MenuDeLujo() {
        menuItems = new Hashtable<Integer, Hamburguesa>();
    }

    /**
     * Metodo para obtener los items del menu
     * 
     * @return
     */
    public Hashtable<Integer, Hamburguesa> getmenuItems() {
        return menuItems;
    }

    /**
     * Metodo para asignar items al menu
     * 
     * @param items
     */
    public void setItems(Hashtable<Integer, Hamburguesa> items) {
        menuItems = items;
    }

    /**
     * Metodo para agregar items al mennu
     * 
     * @param item
     */
    public void addItem(Hamburguesa item) {

    }

    /**
     * Metodo para eliminar items al mennu
     * 
     * @param item
     */
    public void eliminarItem(Hamburguesa item) {

    }

    @Override
    public MenuIterador crearIterador() {
        return new IteradorMenuDeLujo(menuItems);
    }
}