public class GrassPokemon extends Pokemon {
    private String type = "Grass \uD83C\uDF3F";
    private String fastAttack;
    private String chargedAttack;

    public GrassPokemon(String name, int level, int hp, String fastAttack, String chargedAttack) {
        super(name, level, hp);
        this.fastAttack = fastAttack;
        this.chargedAttack = chargedAttack;
    }

    @Override
    public void fastAttack() {
        System.out.println(super.getName() + " fast attacks with " + this.fastAttack + ".");
    }

    @Override
    public void chargedAttack() {
        System.out.println(super.getName() + " charge attacks with " + this.chargedAttack + ".");
    }

    public void pokemonInfo() {
        System.out.println("POKEMON INFORMATION: \nName: " + super.getName() + "\nType: " + this.type + "\nLevel: " + super.getLevel() + "\nHP: " + super.getHp() + "\nFast atack: " + this.fastAttack + "\nCharged attack: " + this.chargedAttack);
    }

    public void attackCombo() {
        fastAttack();
        chargedAttack();
    }

    public String getFastAttack() {
        return this.fastAttack;
    }

    public void setFastAttack(String newFastAttack) {
        this.fastAttack = newFastAttack;
    }

    public String getChargedAttack() {
        return this.chargedAttack;
    }

    public void setChargedAttack(String newChargedAttack) {
        this.chargedAttack = newChargedAttack;
    }

    public String getType() {
        return this.type;
    }
}
