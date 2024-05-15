// Interface untuk armor
interface Armor {
    int getDefense();
}

// Kelas yang merepresentasikan armor Baju Besi
class PlateArmor implements Armor {
    private int defense;

    public PlateArmor() {
        this.defense = 15; // Contoh nilai defense untuk baju besi
    }

    @Override
    public int getDefense() {
        return defense;
    }
}

// Kelas yang merepresentasikan armor Baju Kulit
class LeatherArmor implements Armor {
    private int defense;

    public LeatherArmor() {
        this.defense = 8; // Contoh nilai defense untuk baju kulit
    }

    @Override
    public int getDefense() {
        return defense;
    }
}

//Amylia Kusuma - Fahri Hanafi