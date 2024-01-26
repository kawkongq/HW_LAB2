package monkey;

public class MuscleMonkey extends BaseMonkey {
    private final int POWER_UP = 4 ;

    public MuscleMonkey(int maxHp, int atk, int def) {
        super.setMaxHp(maxHp);
        super.setHp(maxHp);
        super.setAtk(atk);
        super.setDef(def);
    }

    public void attack(BaseMonkey m) {
        super.attack(m);
        super.attack(m);
    }

    public void buff() {
        super.setAtk(getAtk()+POWER_UP);
        super.setDef(getDef()+POWER_UP);
    }
}
