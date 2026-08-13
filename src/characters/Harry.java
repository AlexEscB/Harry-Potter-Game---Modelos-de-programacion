package characters;

import spells.*;

public class Harry extends Character {

    public Harry(){
        super();
        this.name = "Harry Potter";
        this.mainSpell = new ExpectoPatronum();
        this.activeSpell = new ExpectoPatronum();


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
