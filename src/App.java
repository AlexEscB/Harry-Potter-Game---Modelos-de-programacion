import characters.*;
import spells.*;

public class App {
    public static void main(String[] args) throws Exception {
        Harry harry = new Harry();
        Hermione hermione = new Hermione();
        Ron ron = new Ron();
        harry.castSpell(); // usa Expecto Patronum (mainSpell = activeSpell al inicio)
        hermione.castSpell();
        ron.castSpell();

        

        harry.changeSpell(new WingardiumLeviosa());
        harry.castSpell();

        hermione.changeSpell(new OculusReparo());
        hermione.castSpell();
        
        ron.changeSpell(new ExpectoPatronum());
        ron.castSpell();

        harry.sayMainSpell();
        hermione.sayMainSpell();
        ron.sayMainSpell();

         // ahora usa Wingardium Leviosa como activeSpell

    }
}
