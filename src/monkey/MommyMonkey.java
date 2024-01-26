package monkey;

import Logic.game.GameSystem;

public class MommyMonkey extends BaseMonkey{

    public MommyMonkey(int maxHp, int atk, int def) {
        super.setMaxHp(maxHp);
        super.setHp(maxHp);
        super.setAtk(atk);
        super.setDef(def);
    }

    @Override
    public void attack(BaseMonkey m) {
    }

    public void birth() {
        GameSystem.getInstance().getMonkeyContainer().add(new BaseMonkey()) ;
    }
}
