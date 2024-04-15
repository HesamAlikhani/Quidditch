import java.util.*;
import java.lang.*;

public class Team {
    Keeper K = new Keeper("Kpr", 1);
    Seeker S = new Seeker("Skr", 2);
    Chaser C1 = new Chaser("Chsr1", 3);
    Chaser C2 = new Chaser("Chsr2", 4);
    Chaser C3 = new Chaser("Chsr3", 5);
    Beater B1 = new Beater("Btr1", 6);
    Beater B2 = new Beater("Btr2", 7);
    int Goals = 0;
    private void setGoal() {
        Goals++;
    }
    public boolean Play() {
        Random rand = new Random();
        int chanceK = rand.nextInt(99), chanceS = rand.nextInt(99), chanceB1 = rand.nextInt(99), chanceB2 = rand.nextInt(99), chanceC1 = rand.nextInt(99), chanceC2 = rand.nextInt(99), chanceC3 = rand.nextInt(99);
        boolean bool = false;
        if (S.isSuccessful(chanceS)) {
            Goals += 150;
            bool = true;
        }
        else if (K.isSuccessful(chanceK) && (B1.isSuccessful(chanceB1) || B2.isSuccessful(chanceB2)) && ((C1.isSuccessful(chanceC1) && C2.isSuccessful(chanceC2)) || (C1.isSuccessful(chanceC1) && C3.isSuccessful(chanceC3)) || (C2.isSuccessful(chanceC2) && C3.isSuccessful(chanceC3)))) {
            setGoal();
        }
        return bool;
    }
}
