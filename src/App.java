import characters.*;
import spells.WingardiumLeviosa;

public class App {
    public static void main(String[] args) throws Exception {
        Harry harry = new Harry();
        harry.castSpell(); // usa Expecto Patronum (mainSpell = activeSpell al inicio)

        harry.changeSpell(new WingardiumLeviosa());
        harry.castSpell(); // ahora usa Wingardium Leviosa como activeSpell

    }
}
