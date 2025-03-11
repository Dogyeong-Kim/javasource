package inter;

import java.util.Scanner;

public class Fighter extends Unit implements Fightable {

    String msg;
    Scanner sc;

    @Override
    public void move(int x, int y) {
        Math.random();
    }

    @Override
    public void attack(Unit unit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

}
