package ejercicio05;

public class BountyHunterCreator extends CharacterCreator {

    @Override
    protected GameCharacter instantiateCharacter(String name) {
        return new BountyHunter(name);
    }

    @Override
    protected Weapon createWeapon() {
        return new BlasterRifle();
    }
}
