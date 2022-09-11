/**
 * Clase del iterador del menu general de McBurguesas
 */
public class IteradorMenuGeneral implements MenuIterador {
    private MenuItem[] items;// los items del menu
    private int posicion;// la posicion del iterador

    /**
     * Constructor
     * 
     * @param items El arreglo de items
     */
    public IteradorMenuGeneral(MenuItem[] items) {
        this.items = items;
        posicion = 0;
    }

    /**
     * MEtodo para obtener el arreglo de items
     * 
     * @return MenuItem[]
     */
    public MenuItem[] getItems() {
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
    public void setItems(MenuItem[] items) {
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
        return false;// cambiar
    }

    @Override
    public Object next() {
        return null;// cambiar
    }
}