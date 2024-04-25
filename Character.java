public class Character {
    protected String nama;
    protected String ras;
    protected int hp;
    protected int mp;

    public Character(String nama, String ras, int hp, int mp) {
        this.nama = nama;
        this.ras = ras;
        this.hp = hp;
        this.mp = mp;
    }

    public void attack(Character opponent) {
        // implementasi serangan. Misalnya, mengurangi HP lawan berdasarkan AP senjata
    }

    public void useItem(Item item) {
        // implementasi penggunaan item. Misalnya, menambah HP/MP karakter berdasarkan jenis item
    }

    public void increaseHP(int amount) {
        // implementasi peningkatan HP
        this.hp += amount;
    }

    public void increaseMP(int amount) {
        // implementasi peningkatan MP
        this.mp += amount;
    }
}
