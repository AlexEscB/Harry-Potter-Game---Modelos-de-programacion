package spells;

public class ExpectoPatronum extends Spell{
    public ExpectoPatronum(){
      super();
        this.name = "Expecto Patronum";
    }



    @Override
    public void efectSpell(){

        System.out.println("ExpectoPatronum!!");
        System.out.println("Tu Patronum, ha aprarecido");

    }

    
}
