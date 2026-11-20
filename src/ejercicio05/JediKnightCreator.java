package ejercicio05;

public class JediKnightCreator extends CharacterCreator {

    @Override
    protected GameCharacter instantiateCharacter(String name) {
        return new JediKnight(name);
    }

    @Override
    protected Weapon createWeapon() {
        return new Lightsaber();
    }
}
