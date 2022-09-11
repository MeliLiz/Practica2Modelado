/**
 * Interfaz de un iterador
 */
public interface MenuIterador {

    /**
     * MEtodo para saber si hay un siguiente elemento
     * 
     * @return boolean
     */
    public boolean hasNext();

    /**
     * Metodo para obtener el siguiente elemento
     * 
     * @return Object
     */
    public Object next();
}