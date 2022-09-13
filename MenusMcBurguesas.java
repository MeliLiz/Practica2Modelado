import java.util.ArrayList;
import java.util.Iterator;

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
    public MenusMcBurguesas() {
        listaMenus = new ArrayList<Menu>();
        addMenu(new MenuGeneral());
        addMenu(new MenuDinamico());
        addMenu(new MenuDeLujo());
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
     */
    public void mostrarMenu() {
        for(Menu menu:listaMenus){
            Iterator iterador=menu.crearIterador();
            while (iterador.hasNext()) {
                Hamburguesa hamburguesa=(Hamburguesa)iterador.next();
                System.out.println(hamburguesa.getNombre());
            }
        }
    }

    public static void main(String[] args) {
        MenusMcBurguesas menu=new MenusMcBurguesas();
        menu.mostrarMenu();
    }
}