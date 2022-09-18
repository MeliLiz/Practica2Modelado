import java.util.ArrayList;
import java.util.Iterator;

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
    public MenuDinamico() {
        menuItems = new ArrayList<>();

    
        addItem(new HamburguesaBBQ());
        addItem(new HamburguesaDeFrijol());
        addItem(new HamburguesaDePollo());
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
        menuItems.add(item);
    }

    /**
     * Metodo para eliminar items al mennu
     * 
     * @param item
     */
    public void eliminarItem(Hamburguesa item) {

    }

    @Override
    public Iterator crearIterador() {
        return menuItems.iterator();
    }

    @Override
    public String getNombre() {
        return "***MENU DINAMICO**";
    }
}