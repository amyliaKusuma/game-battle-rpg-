// Interface untuk item
interface Item {
    void use(Character character);
}

// Implementasi kelas Potion
class Potion implements Item {
    @Override
    public void use(Character character) {
        // Implementasi penggunaan Potion
        character.setHealthPoint(character.getHealthPoint() + 100);
    }
}

// Implementasi kelas Ether
class Ether implements Item {
    @Override
    public void use(Character character) {
        // Implementasi penggunaan Ether
        character.setMagicPoint(character.getMagicPoint() + 100);
    }
}

// Implementasi kelas Elixir
class Elixir implements Item {
    @Override
    public void use(Character character) {
        // Implementasi penggunaan Elixir
        character.setHealthPoint(character.getHealthPoint() + 150);
        character.setMagicPoint(character.getMagicPoint() + 100);
    }
}

class Remedy implements Item {
    @Override
    public void use(Character character) {
        // Implementasi penggunaan Remedy
        character.useRemedy();
    }
}

class Antidote implements Item {
    @Override
    public void use(Character character) {
        // Implementasi penggunaan Antidote
        character.useAntidote();
    }
}

//Amylia Kusuma - Fahri Hanafi
