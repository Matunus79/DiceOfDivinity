import java.util.LinkedList;

public class DDCharacter {
    public String firstName;
    public String lastName;

    public enum alignment {
        LG,
        NG,
        CG,
        LN,
        N,
        CN,
        LE,
        NE,
        CE
    }

    public alignment alignment;
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;
    public Profession profession1;
    public int profession1level;
    public Profession profession2;
    public int profession2level;

    public enum gender {
        MALE,
        FEMALE,
        DIVERSE;
    }

    public gender gender;
    public String deity;
    public String region;
    public LinkedList<Object> inventory = new LinkedList<>();
    public int characterLevel () {
        return (profession1level+profession2level);}
    public int hitPoints () {
        return (profession1.hpAtLevel1+profession1.hpPerLevel*(profession1level-1) + profession2.hpPerLevel*profession2level);
    }
    public int getModifier (int ability) {
        if (ability>10) {return (ability-10)/2;}
        else {return ((ability-11)/2);}

    }
    public int strModifier () {
        return (getModifier(strength));
    }
    public int dexModifier () {
        return (getModifier(dexterity));
    }
    public int conModifier () {
        return (getModifier(constitution));
    }
    public int intModifier () {
        return (getModifier(intelligence));
    }
    public int wisModifier () {
        return (getModifier(wisdom));
    }
    public int chaModifier () {
        return (getModifier(charisma));
    }

}
