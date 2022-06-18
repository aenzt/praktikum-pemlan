package MobileGames;

public class Warrior extends Character{

    Warrior(){
        setAttack(25);
        setDefense(30);
        setHP(80);
    }

    @Override
    public boolean attack() {
        double count = Math.random() * 10;
        return count > 0 && count <= 6.0;
    }
}
