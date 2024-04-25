public class Weapon {
    private String type;
    private int AP; // Attack Point

    public Weapon(String type, int AP) {
        this.type = type;
        this.AP = AP;
    }

    // Getter dan setter
    public int getAP() {
        return AP;
    }
}
