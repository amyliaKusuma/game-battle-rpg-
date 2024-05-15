public class Main {
    public static void main(String[] args) {
        // Membuat karakter Hero (upcasting)
        Hero hero = new Knight(100, 100, "Arthur", new Sword(), new PlateArmor(), 3);

        // Membuat karakter Foe (upcasting)
        Foe foe = new Goblin(50, 20, "Goblin", new Sword(), new PlateArmor(), 5);

        // Simulate a battle
        System.out.println("Status Hero sebelum pertarungan:");
        System.out.println("Health Point: " + hero.getHealthPoint());
        System.out.println("Magic Point: " + hero.getMagicPoint());

        System.out.println("Status Foe sebelum pertarungan:");
        System.out.println("Health Point: " + foe.getHealthPoint());
        System.out.println("Magic Point: " + foe.getMagicPoint());

        //Polymorphism method calls
        hero.attack(foe);
        foe.takeDamage(20);

        // Status after attack
        System.out.println("Status Hero setelah pertarungan:");
        System.out.println("Health Point: " + hero.getHealthPoint());
        System.out.println("Magic Point: " + hero.getMagicPoint());

        System.out.println("Status Foe setelah pertarungan:");
        System.out.println("Health Point: " + foe.getHealthPoint());
        System.out.println("Magic Point: " + foe.getMagicPoint());
    }
}

//Amylia Kusuma - Fahri Hanafi