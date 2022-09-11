import java.util.ArrayList;

/**
 * Clase del iterador del menu dinamico de McBurguesas
 */
public class IteradorMenuDinamico implements MenuIterador {
    private ArrayList<MenuItem> items;// los items del menu
    private int posicion;// la posicion del iterador

    /**
     * Constructor
     * 
     * @param items El arreglo de items
     */
    public IteradorMenuDinamico(ArrayList<MenuItem> items) {
        this.items = items;
        posicion = 0;
    }

    /**
     * Metodo para obtener el arraylist de items
     * 
     * @return ArrayList<MenuItem>
     */
    public ArrayList<MenuItem> getItems() {
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
    public void setItems(ArrayList<MenuItem> items) {
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