package ejercicio05;

/**
 * Producto auxiliar: arma inicial del personaje.
 */
public abstract class Weapon {

    private final String name;
    private final int damage;

    protected Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
