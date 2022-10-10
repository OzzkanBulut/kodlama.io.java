public class Main {
    public static void main(String[] args) {
    GamerManager gamerManager = new GamerManager(new UserValidationManager());

    Gamer gamer1 = new Gamer("dkfjnk","dfgdf",19929,222);
    gamerManager.add(gamer1);

    Gamer gamer2 = new Gamer("Özkan","Bulut",1999,12345);
    gamerManager.add(gamer2);



    }
}