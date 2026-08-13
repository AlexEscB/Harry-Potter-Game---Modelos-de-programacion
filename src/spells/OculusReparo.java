package spells;

public class OculusReparo extends Spell {

    public OculusReparo(){
        super();
        this.name = "Oculus reparo";
    }



    @Override
    public void efectSpell(){

        System.out.println("Oculus Reparo!!");
        System.out.println("ha reparado los anteojo de harry");

    }
    
}
