package ejercicio05;

/**
 * Creador abstracto: define los métodos de fábrica y el proceso de creación
 * completo (personaje + arma inicial).
 */
public abstract class CharacterCreator {

    // Métodos de fábrica
    protected abstract GameCharacter instantiateCharacter(String name);

    protected abstract Weapon createWeapon();

    // Método plantilla: construye el personaje y le asigna su arma inicial
    public final GameCharacter createCharacter(String name) {
        GameCharacter character = instantiateCharacter(name);
        character.equip(createWeapon());
        return character;
    }
}
