import java.util.Hashtable;
import java.util.Iterator;

/**
 * Clase del menu de lujo de McBurguesas
 */
public class MenuDeLujo implements Menu {

    private Hashtable<Integer, Hamburguesa> menuItems;
    private int llave;

    /**
     * Constructor
     */
    public MenuDeLujo() {
        menuItems = new Hashtable<Integer, Hamburguesa>();
        llave = 0;
        addItem(new HamburguesaClubHouse());
        addItem(new HamburguesaDeLuxe());
        addItem(new HamburguesaBigMeat());
    }

    /**
     * Metodo para obtener la hastable de los items del menu
     * 
     * @return La hashtable donde estan los items del menu
     */
    public Hashtable<Integer, Hamburguesa> getmenuItems() {
        return menuItems;
    }

    /**
     * Metodo para agregar items al mennu
     * 
     * @param item La nueva Hamburguesa a agregar
     */
    public void addItem(Hamburguesa item) {
        menuItems.put(llave, item);
        llave++;
    }

    /**
     * Metodo para eliminar items al mennu
     * 
     * @param llave La llave que le corresponde a la Hamgurguesa
     */
    public void eliminarItem(Integer llave) {
        menuItems.remove(llave);
    }

    /**
     * Metodo para obtener un iterador
     * 
     * @return El iterador del menu
     */
    @Override
    public Iterator crearIterador() {
        return menuItems.values().iterator();
    }

    /**
     * Metodo para obtener el nombre del menu
     * 
     * @return El nombre del menu
     */
    @Override
    public String getNombre() {
        return "***MENU DE LUJO***";
    }

    /**
     * main para pruebas
     * 
     * @param args Los argumentos del main
     */
    public static void main(String[] args) {
        MenuDeLujo menu = new MenuDeLujo();
        Iterator iteradorMenu = menu.crearIterador();

        while (iteradorMenu.hasNext()) {
            Hamburguesa hamburguesa = (Hamburguesa) iteradorMenu.next();
            System.out.println(hamburguesa.getNombre());
        }
        menu.eliminarItem(1);
        System.out.println("================");
        iteradorMenu = menu.crearIterador();
        while (iteradorMenu.hasNext()) {
            Hamburguesa hamburguesa = (Hamburguesa) iteradorMenu.next();
            System.out.println(hamburguesa.getNombre());
        }

    }
}