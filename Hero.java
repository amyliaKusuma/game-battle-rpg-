public class Hero extends Character {
    public Hero(String nama, String ras, int hp, int mp) {
        super(nama, ras, hp, mp);
    }
    // Tambahan implementasi khusus untuk Hero jika diperlukan. Misalnya, implementasi untuk skill khusus Hero
}

class Knight extends Hero{
    public Knight (String nama, String ras, int hp, int mp) {
        super(nama, ras, hp, mp);
    }
}

class Archer extends Hero{
    public Archer (String nama, String ras, int hp, int mp) {
        super(nama, ras, hp, mp);
    }
}

class Fighter extends Hero{
    public Fighter (String nama, String ras, int hp, int mp) {
        super(nama, ras, hp, mp);
    }
}

class fairy extends Hero{
    public fairy (String nama, String ras, int hp, int mp) {
        super(nama, ras, hp, mp);
    }
}
