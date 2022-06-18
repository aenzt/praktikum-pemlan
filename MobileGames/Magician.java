package MobileGames;

public class Magician extends Character{

    Magician(){
        setAttack(60);
        setDefense(10);
        setHP(100);
    }

    @Override
    public boolean attack() {
        double count = Math.random() * 10;
        return count > 0 && count <= 3.5;
    }
}
