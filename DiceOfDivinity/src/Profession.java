public class Profession {
//    Called Profession because "Class" is not an option
    public Die hitDie;
    public int hpAtLevel1;
    public int hpPerLevel;
    public Spell.spellType spelltype;
    public enum casterType {
        FULLCASTER,
        HALFCASTER,
        MARTIAL;
    }
    public casterType casterType;
}
