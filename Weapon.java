interface Weapon {
    int getAttackPoint();

    // Metode untuk mendapatkan biaya MP
    // Ini digunakan untuk senjata yang memerlukan biaya MP ketika digunakan
    int getMagicPointCost();
}

// Kelas yang merepresentasikan senjata Pedang
class Sword implements Weapon {
    private int attackPoint;
    private int magicPointCost;

    public Sword() {
        this.attackPoint = 20; // Contoh nilai AP untuk pedang
        this.magicPointCost = 10; // Contoh biaya MP untuk menggunakan pedang
    }

    @Override
    public int getAttackPoint() {
        return attackPoint;
    }

    @Override
    public int getMagicPointCost() {
        return magicPointCost;
    }
}

// Kelas yang merepresentasikan senjata Busur
class Bow implements Weapon {
    private int attackPoint;
    private int magicPointCost;

    public Bow() {
        this.attackPoint = 15; // Contoh nilai AP untuk busur
        this.magicPointCost = 8; // Contoh biaya MP untuk menggunakan busur
    }

    @Override
    public int getAttackPoint() {
        return attackPoint;
    }

    @Override
    public int getMagicPointCost() {
        return magicPointCost;
    }
}

// Kelas yang merepresentasikan senjata Sarung Tangan
class Gauntlet implements Weapon {
    private int attackPoint;
    private int magicPointCost;

    public Gauntlet() {
        this.attackPoint = 18; // Contoh nilai AP untuk sarung tangan
        this.magicPointCost = 12; // Contoh biaya MP untuk menggunakan sarung tangan
    }

    @Override
    public int getAttackPoint() {
        return attackPoint;
    }

    @Override
    public int getMagicPointCost() {
        return magicPointCost;
    }
}

// Kelas yang merepresentasikan senjata Tongkat Sihir
class MagicWand implements Weapon {
    private int attackPoint;
    private int magicPointCost;

    public MagicWand() {
        this.attackPoint = 25; // Contoh nilai AP untuk tongkat sihir
        this.magicPointCost = 15; // Contoh biaya MP untuk menggunakan tongkat sihir
    }

    @Override
    public int getAttackPoint() {
        return attackPoint;
    }

    @Override
    public int getMagicPointCost() {
        return magicPointCost;
    }
}

//Amylia Kusuma - Fahri Hanafi