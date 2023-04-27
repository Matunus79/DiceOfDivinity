public class Armor {
    public String name;
    public int armorClass;
    public int maxDex;
    public int minStr;
    public enum armorType {
        LIGHT,
        MEDIUM,
        HEAVY;
    }
    public armorType armorType;
    public Weapon.material material;
}
