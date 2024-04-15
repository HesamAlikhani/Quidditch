import java.util.*;
import java.lang.*;

public class Match {
    Team T1 = new Team();
    Team T2 = new Team();
    public void start() {
        for (int i=1 ; i<=100 ; i++) {
            System.out.format("\nRound %d\n", i);
            T1.Play();
            System.out.format("Team A: %d\n", T1.Goals);
            if (T1.Play()) {
                break;
            }
            T2.Play();
            System.out.format("Team B: %d\n", T2.Goals);
            if (T2.Play()) {
                break;
            }
        }
        if (T1.Goals > T2.Goals) {
            System.out.println("\nTeam A is the winner!");
            System.out.format("Scores team A: %d\n", T1.Goals);
            System.out.format("Scores team B: %d\n", T2.Goals);
        }
        else if (T1.Goals < T2.Goals) {
            System.out.println("\nTeam B is the winner!");
            System.out.format("Scores team A: %d\n", T1.Goals);
            System.out.format("Scores team B: %d\n", T2.Goals);
        }
        else {
            System.out.println("\nDraw!");
            System.out.format("Scores team A: %d\n", T1.Goals);
            System.out.format("Scores team B: %d\n", T2.Goals);
        }
    }
}
