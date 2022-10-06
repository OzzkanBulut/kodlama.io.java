public class EnemySoldierManager {
    EnemySoldier enemySoldier;
    public EnemySoldierManager(EnemySoldier enemySoldier){
        this.enemySoldier = enemySoldier;
    }

    public void attack(){
        enemySoldier.attack();

    }
}
