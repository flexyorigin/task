package inf101.rogue101.objects;

public class Gold implements IItem {
    public static final char SYMBOL = 'G';
    @Override
    public int getCurrentHealth() {
        return 1;
    }

    @Override
    public int getDefence() {
        return 0;
    }

    @Override
    public int getMaxHealth() {
        return 1;
    }

    @Override
    public String getLongName() {
        return "Gold";
    }

    @Override
    public String getShortName() {
        return getLongName();
    }

    @Override
    public int getSize() {
        return 4;
    }

    @Override
    public int handleDamage(int amount) {
        return 0;
    }

    @Override
    public char getSymbol() {
        return SYMBOL;
    }
}
