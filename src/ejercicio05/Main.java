package ejercicio05;

public class Main {

    public static void main(String[] args) {
        System.out.println("- Generador de personajes: Star Wars RPG -");

        CharacterCreatorRegistry registry = new CharacterCreatorRegistry();

        // El cliente solo indica el tipo y el nombre
        GameCharacter jedi = registry.create(CharacterType.JEDI_KNIGHT, "Kael");
        GameCharacter sith = registry.create(CharacterType.SITH_INQUISITOR, "Vexa");
        GameCharacter hunter = registry.create(CharacterType.BOUNTY_HUNTER, "Dorn");

        System.out.println();
        jedi.showStats();
        System.out.println();
        sith.showStats();
        System.out.println();
        hunter.showStats();
    }
}
