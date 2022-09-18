import java.util.Iterator;

/**
 * Interfaz para menus iterables
 */
public interface Menu {

    /**
     * Metodo para obtener un iterador
     * 
     * @return El iterador del menu
     */
    public Iterator crearIterador();

    /**
     * Metodo para obtener el nombre del menu
     * 
     * @return El nombre del menu
     */
    public String getNombre();
}