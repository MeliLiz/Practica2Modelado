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
     * Metodo para obtener el arreglo que contiene los items del menu
     * 
     * @return El arreglo que contiene los items del menu
     */
    public Hamburguesa[] getItems() {
        return menuItems;
    }

    /**
     * Metodo para asignar un nuevo arreglo de items del menu
     * 
     * @param items El nuevo arreglo de items
     */
    public void setItems(Hamburguesa[] items) {
        menuItems = items;
    }

    /**
     * Metodo para obtener el numero maximo de menus
     * 
     * @return El numero maximo de items
     */
    public int getMaximoDeItems() {
        return ITEMS_MAXIMOS;
    }

    /**
     * Metodo para obtener un iterador
     * 
     * @return El iterador del menu
     */
    @Override
    public Iterator crearIterador() {
        return new IteradorMenuGeneral();
    }

    /**
     * Metodo para obtener el nombre del menu
     * 
     * @return El nombre del menu
     */
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
         * @return La posicion del iterador
         */
        public int getPosicion() {
            return posicion;
        }

        /**
         * Metodo para saber si el iterador tiene un elemento siguiente
         * 
         * @return false si la posicion es mayor o igual a la longitud del arreglo de
         *         items o si la posicion donde se encontres es <code>null</code>
         */
        @Override
        public boolean hasNext() {
            if (posicion >= menuItems.length || menuItems[posicion] == null) {
                return false;
            }
            return true;
        }

        /**
         * Metodo para obtener el elemento siguiente del iterador.
         * 
         * @return El sigueinte elemento del iterador
         */
        @Override
        public Object next() {
            Hamburguesa menuItem = menuItems[posicion];
            posicion++;
            return menuItem;
        }
    }

}