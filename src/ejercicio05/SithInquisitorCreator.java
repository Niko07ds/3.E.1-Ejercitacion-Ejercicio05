package ejercicio05;

public class SithInquisitorCreator extends CharacterCreator {

    @Override
    protected GameCharacter instantiateCharacter(String name) {
        return new SithInquisitor(name);
    }

    @Override
    protected Weapon createWeapon() {
        return new DoubleBladedLightsaber();
    }
}
