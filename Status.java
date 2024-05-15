// Interface untuk status
interface Status {
    // Tidak perlu memiliki method karena hanya berupa tanda
}

// Implementasi status Weak
class Weak implements Status {
    public void applyEffect(Character character) {
        // Implementasi efek status Weak
        // Menambah damage yang diterima karakter
    }
}

// Implementasi status Poison
class Poison implements Status {
    public void applyEffect(Character character) {
        // Implementasi efek status Poison
        // Mengurangi HP karakter setiap siklus
    }
}

// Implementasi status Sleep
class Sleep implements Status {
    public void applyEffect(Character character) {
        // Implementasi efek status Sleep
        // Karakter tidak dapat melakukan aksi
    }
}

//Amylia Kusuma - Fahri Hanafi