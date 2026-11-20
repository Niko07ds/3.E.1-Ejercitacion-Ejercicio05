package ejercicio05;

/**
 * Producto: personaje del juego con sus estadísticas y su arma.
 */
public abstract class GameCharacter {

    private final String name;
    private final String characterClass;
    private final int health;
    private final int attack;
    private final int defense;
    private Weapon weapon;

    protected GameCharacter(String name, String characterClass, int health, int attack, int defense) {
        this.name = name;
        this.characterClass = characterClass;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public void equip(Weapon weapon) {
        this.weapon = weapon;
    }

    public void showStats() {
        System.out.println("Personaje: " + name + " (" + characterClass + ")");
        System.out.println("  Vida: " + health);
        System.out.println("  Ataque: " + attack);
        System.out.println("  Defensa: " + defense);
        System.out.println("  Arma: " + weapon.getName() + " (daño " + weapon.getDamage() + ")");
    }
}
