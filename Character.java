import java.util.ArrayList;
import java.util.List;

// Kelas abstrak Character sebagai superclass dari Hero dan Foe
public abstract class Character {
    protected int healthPoint;
    protected int magicPoint;
    protected List<Status> statuses;

    // Constructor
    public Character(int healthPoint, int magicPoint) {
        this.healthPoint = healthPoint;
        this.magicPoint = magicPoint;
        this.statuses = new ArrayList<>();
    }

    // Abstract method untuk menyerang lawan
    public abstract void attack(Character opponent);

    // Abstract method untuk menggunakan skill
    public abstract void useSkill(Character opponent);

    // Abstract method untuk menggunakan item
    public abstract void useItem(Item item);

    // Method untuk menerima damage
    public void takeDamage(int damage) {
        healthPoint -= damage;
    }

    // Method untuk menerima efek status
    public void applyStatus(Status status) {
        statuses.add(status);
    }

    // Method untuk menghapus status
    public void removeStatus(Status status) {
        statuses.remove(status);
    }

    // Method untuk menggunakan item Remedy
    public void useRemedy() {
        statuses.clear(); // Menghapus semua jenis status
    }

    // Method untuk menggunakan item Antidote
    public void useAntidote() {
        statuses.removeIf(status -> status instanceof Poison); // Menghapus status Poison
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

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }
}

//Amylia Kusuma - Fahri Hanafi