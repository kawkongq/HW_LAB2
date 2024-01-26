package monkey;

public class BaseMonkey {
    private int maxHp ;
    private int hp ;
    private int atk ;
    private int def ;

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = Math.max(maxHp , 0);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp < 0) {
            this.hp = 0 ;
        }
        else if (hp > maxHp) {
            this.hp = maxHp ;
        }
        else {
            this.hp = hp ;
        }
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = Math.max(atk , 0);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = Math.max(def , 0 );
    }

    public BaseMonkey() {
        this.maxHp = 30 ;
        this.hp = this.maxHp ;
        this.atk = 20 ;
        this.def = 5 ;
    }

    public BaseMonkey(int maxHp, int atk, int def) {
        this.setMaxHp(maxHp);
        this.setAtk(atk);
        this.setHp(maxHp);
        this.setDef(def);
    }

    public void attack(BaseMonkey m) {
        m.setHp(m.getHp() + m.getDef() - this.atk);
    }

    @Override
    public String toString() {
        return getType() +
                " hp=" + hp +
                " atk=" + atk +
                " def=" + def ;
    }

    public String getType() {
        return getClass().getSimpleName();
    }
}
