package characters;

import spells.Spell;
import spells.Expelliarmus;


public class Ron extends Character {

     public Ron(){
        super();
        this.name = "Hermione Granger";
        this.mainSpell = new Expelliarmus();
        this.activeSpell = new Expelliarmus();


    }

    @Override
    public void castSpell(){

        System.out.println(name + ": ");
        this.activeSpell.efectSpell();
        


    }

    @Override
    public void changeSpell(Spell newSpell){

        this.activeSpell = newSpell;
        System.out.print(name + " ha cambiado su hechizo a " + newSpell.name);


    }
    
}
