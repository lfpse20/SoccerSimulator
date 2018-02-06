package Values;

import java.util.concurrent.ThreadLocalRandom;

import static Values.Constants.MAX_SKILL_LEVELS;

public enum SkillLevel {
    BAD,          // 20%
    AVERAGE,      // 30%
    GOOD,         // 25%
    WORLDCLASS,   // 15%
    SUPERSTAR;    // 10%

    public static SkillLevel getRandomSkillLevel(){
        // need to redo so it i can set the probabilities
        return values()[ThreadLocalRandom.current().nextInt(0, MAX_SKILL_LEVELS)];
    }
}
