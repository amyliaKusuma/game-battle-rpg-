// Interface untuk skill
interface Skill {
    void applySkill(Character opponent);
}

class FireSkill implements Skill {
    @Override
    public void applySkill(Character opponent) {
        // Implementasi skill "fire" yang diberikan oleh Dragon
        opponent.takeDamage(50);
        opponent.applyStatus(new Weak());
    }
}

class BiteSkill implements Skill {
    @Override
    public void applySkill(Character opponent) {
        // Implementasi skill "gigit" yang diberikan oleh Goblin
        opponent.takeDamage(30);
        opponent.applyStatus(new Poison());
    }
}

class LullabySkill implements Skill {
    @Override
    public void applySkill(Character opponent) {
        // Implementasi skill "lullaby" yang diberikan oleh Elf
        opponent.applyStatus(new Sleep());
    }
}

//Amylia Kusuma - Fahri Hanafi