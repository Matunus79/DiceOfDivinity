import java.util.Random;
public class Weapon {
    public String name;
    public Die die;
    public int dieNumber;
    public int modifier;
    public enum type {
        SLASHING,
        PIERCING,
        BLUDGEONING;
    }
    public type type;
    public Boolean twoHanded;
    public Boolean ranged;
    public Boolean reach;
    public Boolean light;
    public enum material {
        STANDARD,
        ADAMANTITE,
        MITHRIL,
        SILVER,
        COLDIRON,
        MIZZIUM
    }
    public material material;
    public Weapon (String name, int die, int dieNumber, int modifier, type type, Boolean twoHanded, boolean ranged, Boolean reach, Boolean light, material material) {
        this.name=name;
        this.die=new Die(die);
        this.dieNumber=dieNumber;
        this.modifier=modifier;
        this.type=type;
        this.twoHanded=twoHanded;
        this.ranged=ranged;
        this.reach=reach;
        this.light=light;
        this.material= material;
    }
    public int damage () {
        int output=0;
        for (int i = 0; i < dieNumber; i++) {
            output=output+die.roll();
        }
        return output;
    }
}
