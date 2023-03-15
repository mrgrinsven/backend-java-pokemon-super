public class FireFlyingPokemon extends FirePokemon {
    private String type2 = "Flying \uD83E\uDEBD";

    public FireFlyingPokemon(String name,  int level, int hp, String fastAttack, String chargedAttack) {
        super(name, level, hp, fastAttack, chargedAttack);
    }

    @Override
    public void pokemonInfo() {
        System.out.println("POKEMON INFORMATION: \nName: " + super.getName() + "\nTypes: " + super.getType() + ", " + this.type2 + "\nLevel: " + super.getLevel() + "\nHP: " + super.getHp() + "\nFast atack: " + super.getFastAttack() + "\nCharged attack: " + super.getChargedAttack());
    }

}
