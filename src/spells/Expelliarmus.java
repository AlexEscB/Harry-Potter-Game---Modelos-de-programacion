package spells;

public class Expelliarmus extends Spell {

    public Expelliarmus(){
      super();
        this.name = "Expelliarmus";
    }



    @Override
    public void efectSpell(){

        System.out.println("Expeliarmus!");
        System.out.println("le has quitado el arma al alguien.");

    }

    
}

    

