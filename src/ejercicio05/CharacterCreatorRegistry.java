package ejercicio05;

import java.util.EnumMap;
import java.util.Map;

/**
 * Estructura creadora: el cliente solo indica el tipo deseado y este registro
 * delega en el creador correspondiente (sin bloques condicionales).
 */
public class CharacterCreatorRegistry {

    private final Map<CharacterType, CharacterCreator> creators = new EnumMap<>(CharacterType.class);

    public CharacterCreatorRegistry() {
        creators.put(CharacterType.JEDI_KNIGHT, new JediKnightCreator());
        creators.put(CharacterType.SITH_INQUISITOR, new SithInquisitorCreator());
        creators.put(CharacterType.BOUNTY_HUNTER, new BountyHunterCreator());
    }

    public GameCharacter create(CharacterType type, String name) {
        CharacterCreator creator = creators.get(type);
        if (creator == null) {
            throw new IllegalArgumentException("Tipo de personaje no registrado: " + type);
        }
        return creator.createCharacter(name);
    }
}
