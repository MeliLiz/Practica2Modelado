/**
 * Clase del iterador del menu general de McBurguesas
 */
public class IteradorMenuGeneral implements MenuIterador {
    private Hamburguesa[] items;// los items del menu
    private int posicion;// la posicion del iterador

    /**
     * Constructor
     * 
     * @param items El arreglo de items
     */
    public IteradorMenuGeneral(Hamburguesa[] items) {
        this.items = items;
        posicion = 0;
    }

    /**
     * MEtodo para obtener el arreglo de items
     * 
     * @return MenuItem[]
     */
    public Hamburguesa[] getItems() {
        return items;
    }

    /**
     * Metodo para obtener la posicion del iterador
     * 
     * @return int
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * Metodo para asignar los items del iterador
     * 
     * @param items
     */
    public void setItems(Hamburguesa[] items) {
        this.items = items;
    }

    /**
     * Metodo para asignar la posicion del iterador
     * 
     * @param posicion
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean hasNext() {
        if(posicion >= items.length || items[posicion]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Hamburguesa menuItem=items[posicion];
        posicion++;
        return menuItem;
    }
}