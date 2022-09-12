public class HamburguesaBBQ extends Hamburguesa{
    public HamburguesaBBQ(){
        super(3182,"Hamburguesa BBQ", "Hamburguesa de carne de costilla a la BBQ con lechuga",150,false,false);
    }

    @Override
    public void prepararCarne() {
        System.out.println("Preparando la costilla a la BBQ");
        
    }

    @Override
    public void ponerQueso() {
        return;
    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga");
        
    }
}
