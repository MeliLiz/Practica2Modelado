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
        llave=0;
        addItem(new HamburguesaClubHouse());
        addItem(new HamburguesaDeLuxe());
        addItem(new HamburguesaBigMeat());
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
     * Metodo para agregar items al mennu
     * 
     * @param item
     */
    public void addItem(Hamburguesa item) {
        menuItems.put(llave, item);
        llave++;
    }

    /**
     * Metodo para eliminar items al mennu
     * 
     * @param item
     */
    public void eliminarItem(Integer llave) {
        menuItems.remove(llave);
    }

    @Override
    public Iterator crearIterador() {
        return menuItems.values().iterator();
    }

    @Override
    public String getNombre() {
        return "***MENU DE LUJO***";
    }

    public static void main(String[] args) {
        MenuDeLujo menu = new MenuDeLujo();
        Iterator iteradorMenu = menu.crearIterador();
        

        while(iteradorMenu.hasNext()){
            Hamburguesa hamburguesa = (Hamburguesa) iteradorMenu.next();
            System.out.println(hamburguesa.getNombre());
        }
        menu.eliminarItem(1);
        System.out.println("================");
        iteradorMenu = menu.crearIterador();
        while(iteradorMenu.hasNext()){
            Hamburguesa hamburguesa = (Hamburguesa) iteradorMenu.next();
            System.out.println(hamburguesa.getNombre());
        }


    }
}