import java.util.ArrayList;

/**
 * Clase del iterador del menu dinamico de McBurguesas
 */
public class IteradorMenuDinamico implements MenuIterador {
    private ArrayList<Hamburguesa> items;// los items del menu
    private int posicion;// la posicion del iterador

    /**
     * Constructor
     * 
     * @param items El arreglo de items
     */
    public IteradorMenuDinamico(ArrayList<Hamburguesa> items) {
        this.items = items;
        posicion = 0;
    }

    /**
     * Metodo para obtener el arraylist de items
     * 
     * @return ArrayList<MenuItem>
     */
    public ArrayList<Hamburguesa> getItems() {
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
    public void setItems(ArrayList<Hamburguesa> items) {
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
        if(posicion>=items.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Hamburguesa item= items.get(posicion);
        posicion++;
        return item;
    }
}