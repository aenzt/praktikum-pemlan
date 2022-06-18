package MobileGames;

public class Healer extends Character{
    Healer(){
        setAttack(10);
        setDefense(10);
        setHP(70);
    }

    void heal(){
        setHP(getHP() + 25);
    }

    @Override
    public boolean attack() {
        double count = Math.random() * 10;
        return count > 0 && count <= 8.5;
    }
}
