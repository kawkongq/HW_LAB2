package monkey;

import Logic.game.GameSystem;

public class Ape extends BaseMonkey{
    public Ape(int maxHp, int atk, int def) {
        super.setMaxHp(maxHp);
        super.setHp(maxHp);
        super.setAtk(atk);
        super.setDef(def);
    }

    @Override
    public void attack(BaseMonkey m) {
        super.attack(m);
    }

    public void attackAOE() {
        for(int i = 0; i < GameSystem.getInstance().getMonkeyContainer().size() ; i++) {
            super.attack(GameSystem.getInstance().getMonkeyContainer().get(i));
        }
    }
}
