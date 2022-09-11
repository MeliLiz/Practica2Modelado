import java.util.ArrayList;

/**
 * Clase del menu dinamico de McBurguesas
 */
public class MenuDinamico implements Menu {

    private ArrayList<MenuItem> menuItems;// Los items del menu

    /**
     * Constructor
     * 
     * @param items Los menus disponibles
     */
    public MenuDinamico(ArrayList<MenuItem> items) {
        menuItems = items;
    }

    /**
     * Metodo para obtener la lista de menus
     * 
     * @return
     */
    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    /**
     * Metodo para asignar los items del menu
     * 
     * @param menuItems
     */
    public void setItems(ArrayList<MenuItem> items) {
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