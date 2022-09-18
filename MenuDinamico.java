import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase del menu dinamico de McBurguesas
 */
public class MenuDinamico implements Menu {

    private ArrayList<Hamburguesa> menuItems;// Los items del menu

    /**
     * Constructor
     */
    public MenuDinamico() {
        menuItems = new ArrayList<>();

        addItem(new HamburguesaBBQ());
        addItem(new HamburguesaDeFrijol());
        addItem(new HamburguesaDePollo());
    }

    /**
     * Metodo para obtener la lista donde estan los items del menu
     * 
     * @return La lista donde estan los items del menu
     */
    public ArrayList<Hamburguesa> getItems() {
        return menuItems;
    }

    /**
     * Metodo para asignar una nueva lista a los items del menu
     * 
     * @param items La nueva lista a asignar
     */
    public void setItems(ArrayList<Hamburguesa> items) {
        menuItems = items;
    }

    /**
     * Metodo para agregar items al menu
     * 
     * @param item La nueva Hamburguesa a agregar
     */
    public void addItem(Hamburguesa item) {
        menuItems.add(item);
    }

    /**
     * Metodo para eliminar items al menu
     * 
     * @param item La Hamburguesa a eliminar
     */
    public void eliminarItem(Hamburguesa item) {

    }

    /**
     * Metodo para obtener un iterador
     * 
     * @return El iterador del menu
     */
    @Override
    public Iterator crearIterador() {
        return menuItems.iterator();
    }

    /**
     * Metodo para obtener el nombre del menu
     * 
     * @return El nombre del menu
     */
    @Override
    public String getNombre() {
        return "***MENU DINAMICO**";
    }
}