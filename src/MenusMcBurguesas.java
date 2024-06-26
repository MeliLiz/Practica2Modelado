import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase de los menus disponibles en McBurguesa
 */
public class MenusMcBurguesas {

    private ArrayList<Menu> listaMenus;// Lista de los menus disponibles
    public static final String CYAN = "\u001B[36m";
    public static final String RESET = "\u001B[0m";

    /**
     * Constructor
     */
    public MenusMcBurguesas() {
        listaMenus = new ArrayList<Menu>();
        addMenu(new MenuGeneral());
        addMenu(new MenuDinamico());
        addMenu(new MenuDeLujo());
    }

    /**
     * Metodo para obtener la lista de menus disponibles
     * 
     * @return La lista de menus disponibles
     */
    public ArrayList<Menu> getMenusDisponibles() {
        return listaMenus;
    }

    /**
     * Metodo para asignar la lista de menus disponibles
     * 
     * @param menus La nueva lista de menus disponibles
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
        listaMenus.add(menu);
    }

    /**
     * Metodo para eliminar un menu de los menus disponibles
     * 
     * @param menu El menu por eliminar
     */
    public void eliminarMenu(Menu menu) {
        listaMenus.remove(menu);
    }

    /**
     * Metodo para mostrar los menus disponibles
     * Se usa un for each para iterar en cada menu en la lista de menus.
     * Se manda a llamar a su iterador, para imprimir los datos de cada Hamburguesa
     * en los menus.
     */
    public void mostrarMenu() {
        for (Menu menu : listaMenus) {
            System.out.println(CYAN + "\n###" + menu.getNombre() + "###\n" + RESET);
            Iterator iterador = menu.crearIterador();
            while (iterador.hasNext()) {
                Hamburguesa hamburguesa = (Hamburguesa) iterador.next();
                System.out.println(hamburguesa);
            }
        }
    }

    /**
     * Metodo para buscar un platillo con su id
     * 
     * @param id El id del platillo
     */
    public Hamburguesa buscarPlatillo(int id) {
        for (Menu menu : listaMenus) {
            Iterator iterador = menu.crearIterador();
            while (iterador.hasNext()) {
                Hamburguesa hamburguesa = (Hamburguesa) iterador.next();
                if (hamburguesa.getID() == id) {
                    return hamburguesa;
                }
            }
        }
        return null;
    }

    /**
     * main para pruebas
     * 
     * @param args Los arguentos del main
     */
    public static void main(String[] args) {
        MenusMcBurguesas menu = new MenusMcBurguesas();
        menu.mostrarMenu();
    }
}