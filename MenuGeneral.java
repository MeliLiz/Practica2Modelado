import java.util.Iterator;
/**
 * Clase del menu general de McBurguesas
 */
public class MenuGeneral implements Menu {

    private Hamburguesa[] menuItems;
    private final int ITEMS_MAXIMOS = 3;
   

    /**
     * Constructor
     * 
     * @param maxDeItems //El numero maximo de items que se podra tener en el menu
     */
    public MenuGeneral() {
        menuItems = new Hamburguesa[ITEMS_MAXIMOS];
        menuItems[0] = new HamburguesaClasica();
        menuItems[1] = new HamburguesaClasicaVegetariana();
        menuItems[2] = new HamburguesaDoble();
    }

    /**
     * Metodo para obtener el arreglo de items del menu
     * 
     * @return MenuItem[]
     */
    public Hamburguesa[] getItems() {
        return menuItems;
    }

    /**
     * Metodo para asignar el arreglo de items del menu
     * 
     * @param items
     */
    public void setItems(Hamburguesa[] items) {
        menuItems = items;
    }

    /**
     * Metodo para obtener el numero maximo de menus
     * 
     * @return int
     */
    public int getMaximoDeItems() {
        return ITEMS_MAXIMOS;
    }


    

    @Override
    public Iterator crearIterador() {
        return new IteradorMenuGeneral();
    }

    @Override
    public String getNombre() {
        return "***MENU GENERAL***";
    }

/**
 * Clase del iterador del menu general de McBurguesas
 */
private class IteradorMenuGeneral implements Iterator {
    private int posicion;// la posicion del iterador

    /**
     * Metodo para obtener la posicion del iterador
     * 
     * @return int
     */
    public int getPosicion() {
        return posicion;
    }

    @Override
    public boolean hasNext() {
        if(posicion >= menuItems.length || menuItems[posicion]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Hamburguesa menuItem=menuItems[posicion];
        posicion++;
        return menuItem;
    }
}

}