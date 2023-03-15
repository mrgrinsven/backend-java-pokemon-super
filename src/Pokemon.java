public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;

    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    abstract void fastAttack();
    abstract void chargedAttack ();

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int newLevel) {
        this.level = newLevel;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int newHp) {
        this.hp = newHp;
    }
}
