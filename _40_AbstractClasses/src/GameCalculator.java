public abstract class GameCalculator { // Abstract class`ı kim inherit ediyosa içindeki abstract
                                        // methodları bulundurmak zorunda!
    public abstract void hesapla(); // Hesapla methodu diğer classlarda bulunmak zorunda

    public final void gameOver(){   // Bu bulunmak zorunda değil, zaten final olduğu için değiştirilemez
        System.out.println("Game over!");
    }
}
