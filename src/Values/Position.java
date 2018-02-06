package Values;

import java.util.concurrent.ThreadLocalRandom;

import static Values.Constants.MAX_POSITIONS;

public enum Position {
    FORWARD, WINGER, CENTER_ATTACKING_MID, OUTSIDE_MID, CENTER_MID,
    CENTER_DEFENSIVE_MID, FULL_BACK, CENTER_BACK, GOALKEEPER;

    public static Position getRandomPosition(){
        return values()[ThreadLocalRandom.current().nextInt(0, MAX_POSITIONS)];
    }
}
