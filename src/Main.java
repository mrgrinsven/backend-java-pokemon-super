public class Main {
    public static void main(String[] args) {
        FirePokemon charmeleon = new FirePokemon("Charmeleon", 20, 600, "Ember", "Flame Burst");
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 27, 700, "Bubble", "Aqua Tail");
        GrassPokemon tangela = new GrassPokemon("Tangela", 30, 900, "Vine Whip", "Grass knot");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 50, 999, "Thunder Shock", "Wild charge");
        FireFlyingPokemon charizard = new FireFlyingPokemon("Charizard", 90, 1200, "Fire spin", "Blast Burn");

        charmeleon.pokemonInfo();
        System.out.println();
        charmeleon.attackCombo();
        System.out.println();

        squirtle.pokemonInfo();
        System.out.println();
        squirtle.attackCombo();
        System.out.println();

        tangela.pokemonInfo();
        System.out.println();
        tangela.attackCombo();
        System.out.println();

        pikachu.pokemonInfo();
        System.out.println();
        pikachu.attackCombo();
        System.out.println();

        //2 type pokemon
        charizard.pokemonInfo();
        System.out.println();
        charizard.attackCombo();
        System.out.println();

        //super methods
        charizard.chargedAttack();
        charizard.fastAttack();
    }
}
