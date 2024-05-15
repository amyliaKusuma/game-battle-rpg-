// Kelas Foe dengan atribut Health Point (HP), Magic Point (MP), nama, dan ras
public class Foe {
    private int healthPoint;
    private int magicPoint;
    private String name;
    private String race;
    private Weapon weapon;
    private Armor armor;
    private int level;

    // Constructor
    public Foe(int healthPoint, int magicPoint, String name, String race, Weapon weapon, Armor armor, int level) {
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
            case "Orc":
                this.healthPoint = 220 + (level * 22);
                this.magicPoint = 40 + (level * 4);
                break;
            case "Elf":
                this.healthPoint = 130 + (level * 13);
                this.magicPoint = 80 + (level * 8);
                break;
            case "Dwarf":
                this.healthPoint = 200 + (level * 20);
                this.magicPoint = 50 + (level * 5);
                break;
            case "Skeleton":
                this.healthPoint = 100 + (level * 10);
                this.magicPoint = 30 + (level * 3);
                break;
            case "Goblin":
                this.healthPoint = 110 + (level * 11);
                this.magicPoint = 20 + (level * 2);
                break;
            case "Dragon":
                this.healthPoint = 300 + (level * 30);
                this.magicPoint = 100 + (level * 10);
                break;
            default:
                throw new IllegalArgumentException("Unknown race: " + race);
        }
    }

    // Method untuk menyerang hero
    public void attack(Hero hero) {
        // Memeriksa apakah magicPoint mencukupi sebelum menyerang
        if (magicPoint >= weapon.getMagicPointCost()) {
            int damage = weapon.getAttackPoint() - hero.getArmor().getDefense();
            if (damage < 0) {
                damage = 0;
            }
            hero.takeDamage(damage);
            // Mengurangi MP setiap kali menyerang dengan skill/magic
            magicPoint -= weapon.getMagicPointCost(); // Menggunakan polymorphism untuk mendapatkan biaya MP dari
                                                      // senjata
        } else {
            System.out.println("Magic Point tidak mencukupi untuk menyerang dengan skill/magic!");
        }
    }

    // Method untuk menerima damage
    public void takeDamage(int damage) {
        healthPoint -= damage;
    }

    // Method untuk menaikkan HP dengan item Potion
    public void usePotion(int hpIncrease) {
        healthPoint += hpIncrease;
    }

    // Method untuk menaikkan MP dengan item Ether
    public void useEther(int mpIncrease) {
        magicPoint += mpIncrease;
    }

    // Method untuk menaikkan HP dan MP secara bersamaan dengan menggunakan item
    // Elixir
    public void useElixir(int hpIncrease, int mpIncrease) {
        healthPoint += hpIncrease;
        magicPoint += mpIncrease;
    }

    // Method untuk mendapatkan Armor
    public Armor getArmor() {
        return armor;
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

// Kelas Ras Orc
class Orc extends Foe {
    public Orc(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Orc", new Sword(), new PlateArmor(), level);
    }

    @Override
    public void attack(Hero hero) {
        // Implementasi serangan khusus untuk ras Orc
    }
}

// Kelas Ras Elf
class Elf extends Foe {
    public Elf(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Elf", new Bow(), new LeatherArmor(), level);
    }

    @Override
    public void attack(Hero hero) {
        // Implementasi serangan khusus untuk ras Elf
    }
}

// Kelas Ras Dwarf
class Dwarf extends Foe {
    public Dwarf(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Dwarf", new Gauntlet(), new PlateArmor(), level);
    }

    @Override
    public void attack(Hero hero) {
        // Implementasi serangan khusus untuk ras Dwarf
    }
}

// Kelas Ras Skeleton
class Skeleton extends Foe {
    public Skeleton(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Skeleton", new MagicWand(), new LeatherArmor(), level);
    }

    @Override
    public void attack(Hero hero) {
        // Implementasi serangan khusus untuk ras Skeleton
    }
}

// Kelas Ras Goblin
class Goblin extends Foe {
    public Goblin(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Goblin", new Sword(), new PlateArmor(), level);
    }

    @Override
    public void attack(Hero hero) {
        // Implementasi serangan khusus untuk ras Goblin
    }
}

// Kelas Ras Dragon
class Dragon extends Foe {
    public Dragon(int healthPoint, int magicPoint, String name, Weapon weapon, Armor armor, int level) {
        super(healthPoint, magicPoint, name, "Dragon", new MagicWand(), new LeatherArmor(), level);
    }

    @Override
    public void attack(Hero hero) {
        // Implementasi serangan khusus untuk ras Dragon
    }
}

//Amylia Kusuma - Fahri Hanafi