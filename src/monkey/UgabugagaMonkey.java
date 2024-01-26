package monkey;

import java.lang.reflect.Field;

public class UgabugagaMonkey extends BaseMonkey{
    private final int DEBUFF = 1 ;
    private final int HEAL = 10 ;

    public UgabugagaMonkey(int maxHp, int atk, int def) {
        super.setMaxHp(maxHp);
        super.setHp(maxHp);
        super.setAtk(atk);
        super.setDef(def);
    }

    public void attack(BaseMonkey m) {
        m.setHp(m.getHp()+m.getDef()-super.getAtk());
        m.setAtk(m.getAtk()-DEBUFF);
        m.setDef(m.getDef()-DEBUFF);
    }

    public void heal(BaseMonkey m) {
        m.setHp(m.getHp()+HEAL);
        if(m.getHp() > super.getMaxHp()) {
            m.setHp(super.getMaxHp());
        }
    }
}
