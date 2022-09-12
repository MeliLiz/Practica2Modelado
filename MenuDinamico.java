import java.util.ArrayList;

/**
 * Clase del menu dinamico de McBurguesas
 */
public class MenuDinamico implements Menu {

    private ArrayList<Hamburguesa> menuItems;// Los items del menu

    /**
     * Constructor
     * 
     * @param items Los menus disponibles
     */
    public MenuDinamico(ArrayList<Hamburguesa> items) {
        menuItems = items;

        
    }

    /**
     * Metodo para obtener la lista de menus
     * 
     * @return
     */
    public ArrayList<Hamburguesa> getItems() {
        return menuItems;
    }

    /**
     * Metodo para asignar los items del menu
     * 
     * @param menuItems
     */
    public void setItems(ArrayList<Hamburguesa> items) {
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
        return new IteradorMenuDinamico(menuItems);
    }
}