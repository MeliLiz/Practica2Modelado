public class HamburguesaDeFrijol extends Hamburguesa{
    public HamburguesaDeFrijol(){
        super(1010,"Hamburguesa de frijol", "Hamburguesa con carne de frijol, con queso crema, lechuga y jitomate",140,true,true);
    }

    @Override
    public void ponerQueso() {
       System.out.println("Poniendo queso crema");
        
    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo lechuga y jitomate");
        
    }

    @Override
    public void prepararCarne() {
        System.out.println("Preparando la carne de pasta de frijol");
        
    }
}
