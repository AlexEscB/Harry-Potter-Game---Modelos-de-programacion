package characters;

import spells.*;

public class Hermione extends Character {

    public Hermione(){
        super();
        this.name = "Hermione Granger";
        this.mainSpell = new WingardiumLeviosa();
        this.activeSpell = new WingardiumLeviosa();


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

    @Override
    public void sayMainSpell(){

        System.out.println(name + ": " + "mi mejor hechizo es " + mainSpell.name);

    }
    
}
