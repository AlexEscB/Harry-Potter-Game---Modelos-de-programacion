package spells;

public class WingardiumLeviosa extends Spell {

    public WingardiumLeviosa(){
        super();
        this.name = "Wingardium leviosa";
    }



    @Override
    public void efectSpell(){

        System.out.println("Wingardium leviosa!!");
        System.out.println("Has hecho flotar algo");

    }
    
}
