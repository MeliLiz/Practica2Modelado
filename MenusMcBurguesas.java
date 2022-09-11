import java.util.ArrayList;

/**
 * Clase de los menus disponibles en McBurguesa
 */
public class MenusMcBurguesas {

    private ArrayList<Menu> listaMenus;// Lista de los menus disponibles

    /**
     * Constructor
     * 
     * @param menus La lista de menus
     */
    public MenusMcBurguesas(ArrayList<Menu> menus) {
        listaMenus = menus;
    }

    /**
     * Metodo para obtener la lista de menus disponibles
     * 
     * @return
     */
    public ArrayList<Menu> getMenusDisponibles() {
        return listaMenus;
    }

    /**
     * Metodo para asignar la lista de menus disponibles
     * 
     * @param menus
     */
    public void setMenusDisponibles(ArrayList<Menu> menus) {
        listaMenus = menus;
    }

    /**
     * Metodo para agregar un menu a los menus disponibles
     * 
     * @param menu El menu por agregar
     */
    public void addMenu(Menu menu) {

    }

    /**
     * Metodo para eliminar un menu de los menus disponibles
     * 
     * @param menu El menu por eliminar
     */
    public void eliminarMenu(Menu menu) {

    }

    /**
     * Metodo para mostrar los menus disponibles
     */
    public void mostrarMenu() {

    }

    /**
     * Metodo para mostrar los menus disponibles
     * 
     * @param iterador
     */
    public void mostrarMenu(MenuIterador iterador) {

    }
}