package Values;

import java.util.concurrent.ThreadLocalRandom;

public enum Foot {
    LEFT, RIGHT;

    public static Foot getRandomFoot(){
        return values()[ThreadLocalRandom.current().nextInt(0,2)];
    }
}
