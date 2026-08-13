package characters;

import spells.*;

public abstract class Character {

    public String name; 
    public Spell mainSpell;
    public Spell activeSpell;
    public Boolean wand = true;

    public void castSpell(){}
    public void changeSpell(Spell newSpell){}
    public void sayMainSpell(){}

    
}