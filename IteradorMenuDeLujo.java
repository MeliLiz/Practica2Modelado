import java.util.Hashtable;

/**
 * Clase de iterador del menu de lujo de McBurguesas
 */
public class IteradorMenuDeLujo implements MenuIterador {

    private Hashtable<Integer,Hamburguesa> items;

    /**
     * Constructor
     * 
     * @param items La hashtable de items
     */
    public IteradorMenuDeLujo(Hashtable<Integer,Hamburguesa> items) {
        this.items = items;
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