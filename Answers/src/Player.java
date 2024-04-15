import java.util.*;
import java.lang.*;

public abstract class Player implements Success {
    private String name;
    private int number;
    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
class Keeper extends Player {
    public Keeper(String name, int number) {
        super(name, number);
    }
    public boolean isSuccessful(int chance) {
        if (chance+1 <= 70) {
            return true;
        } else {
            return false;
        }
    }
}
class Seeker extends Player {
    public Seeker(String name, int number) {
        super(name, number);
    }
    public boolean isSuccessful(int chance) {
        if (chance+1 <= 5) {
            return true;
        } else {
            return false;
        }
    }
}
class Chaser extends Player {
    public Chaser(String name, int number) {
        super(name, number);
    }
    public boolean isSuccessful(int chance) {
        if (chance+1 <= 30) {
            return true;
        } else {
            return false;
        }
    }
}
class Beater extends Player {
    public Beater(String name, int number) {
        super(name, number);
    }
    public boolean isSuccessful(int chance) {
        if (chance+1 <= 40) {
            return true;
        } else {
            return false;
        }
    }
}

