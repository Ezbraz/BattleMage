package BattleMage.v00;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Character mago01 = new Character("morgana", "hydro", "poison");

        mago01.detalheMago();

        Character mago02 = new Character("viktor", "thunder", "earth");

        mago02.detalheMago();

        Battle duel01 = new Battle();
        do {
            duel01.duel(mago01, mago02);
            if(mago02.getLife()<=0) break;
            duel01.duel(mago02, mago01);
        } while (mago01.getLife()>0 && mago02.getLife()>0);
        duel01.setLoser(mago01, mago02);

    }
}
