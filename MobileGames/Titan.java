package MobileGames;

public class Titan extends Character{

    Titan(){
        setAttack(45);
        setDefense(0);
        setHP(200);
    }

    @Override
    public boolean attack(){
        double count = Math.random() * 10;
        return count > 0 && count <= 4.0;
    }
}
