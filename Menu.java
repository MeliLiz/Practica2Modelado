import java.util.Iterator;
/**
 * Interfaz para menus iterables
 */
public interface Menu {

    /**
     * Metodo para obtener un iterador
     */
    public Iterator crearIterador();

    /**
     * Metodo para obtener el nombre del menu
     * @return
     */
    public String getNombre();
}