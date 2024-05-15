// Kelas Hero dengan atribut Health Point (HP), Magic Point (MP), dan ras
public class Hero {
    private int healthPoint;
    private int magicPoint;
    private String name;
    private String race;
    private Weapon weapon;
    private Armor armor;
    private int level;

    // Constructor
    public Hero(int healthPoint, int magicPoint, String name, String race, Weapon weapon, Armor armor, int level) {
        this.healthPoint = healthPoint;
        this.magicPoint = magicPoint;
        this.name = name;
        this.race = race;
        this.weapon = weapon;
        this.armor = armor;
        this.level = level;
        setInitialStats();
    }

    // Method untuk menginisialisasi HP dan MP berdasarkan level dan race
    private void setInitialStats() {
        switch (race) {
            case "Knight":
                this.healthPoint = 200 + (level * 20);
                this.magicPoint = 50 + (level * 5);
                break;
            case "Archer":
                this.healthPoint = 150 + (level * 15);
                this.magicPoint = 70 + (level * 7);
                break;
            case "Fighter":
                this.healthPoint = 180 + (level * 18);
                this.magicPoint = 60 + (level * 6);
                break;
            case "Fairy":
                this.healthPoint = 120 + (level * 12);
                this.magicPoint = 100 + (level * 10);
                break;
            default:
                throw new IllegalArgumentException("Unknown race: " + race);
        }
    }

    // Method untuk menyerang lawan
    public void attack(Foe foe) {
        // Memastikan armor tidak null sebelum mengakses getDefense()
        int damage = weapon.getAttackPoint();
        if (armor != null) {
            damage -= armor.getDefense();
        }
        if (damage < 0) {
            damage = 0;
        }
        foe.takeDamage(damage); // Memanggil method takeDamage pada Foe
    }

    // Method untuk menerima damage
    public void takeDamage(int damage) {
        healthPoint -= damage;
    }

    // Getters dan setters
    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        setInitialStats(); // Update stats when level changes
    }
}

// Kelas turunan dari Hero untuk ras Knight
class Knight extends Hero {
    public Knight(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Knight", new Sword(), new PlateArmor(), level);
    }
}

// Kelas turunan dari Hero untuk ras Archer
class Archer extends Hero {
    public Archer(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Archer", new Bow(), new LeatherArmor(), level);
    }
}

// Kelas turunan dari Hero untuk ras Fighter
class Fighter extends Hero {
    public Fighter(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Fighter", new Gauntlet(), new PlateArmor(), level);
    }
}

// Kelas turunan dari Hero untuk ras Fairy
class Fairy extends Hero {
    public Fairy(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Fairy", new MagicWand(), new LeatherArmor(), level);
    }
}

//Amylia Kusuma - Fahri Hanafi
