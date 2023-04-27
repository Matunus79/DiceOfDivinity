public class Spell {
    public String name;
    public enum spellType {
        ARCANE,
        DIVINE
    }
    public spellType spellType;
    public enum school {
        ABJURATION,
        CONJURATION,
        DIVINATION,
        ENCHANTMENT,
        EVOCATION,
        ILLUSION,
        NECROMANCY,
        TRANSMUTATION

    }
    public school school;
    public int level;
    public Die damageDie;
    public int damagemultiplier;
    public Boolean ritual;
    public enum element {
        AIR,
        EARTH,
        FIRE,
        WATER,
        NEGATIVE,
        POSITIVE,
        NECROTIC,
        RADIANT,
        FORCE,
        NONE;
    }
    public element element;
    public String description;
}
