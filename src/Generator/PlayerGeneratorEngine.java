package Generator;

import Player.Player;
import Player.Skill;
import Values.Foot;
import Values.Position;
import Values.SkillLevel;

import java.util.concurrent.ThreadLocalRandom;

import static Values.Constants.*;

public class PlayerGeneratorEngine {

    private static int JERSEY_NUMBER_COUNTER = 0;

    // wont be initialized
    private PlayerGeneratorEngine(){}

    public static Player generatePlayer(){

        SkillLevel skillLevel = SkillLevel.getRandomSkillLevel();

        Skill skill;

        switch(skillLevel){
            case BAD:
                skill = generateBadSkillLevel();
                break;
            case AVERAGE:
                skill = generateAverageSkillLevel();
                break;
            case GOOD:
                skill = generateGoodSkillLevel();
                break;
            case WORLDCLASS:
                skill = generateWCSkillLevel();
                break;
            case SUPERSTAR:
                skill = generateSSSkillLevel();
                break;
            default:
                skill = null;
        }

        return new Player.Builder()
                .name("temp, for now")
                .number(++JERSEY_NUMBER_COUNTER)
                .position(Position.getRandomPosition())
                .height(produceRandomHeight())
                .weight(produceRandomWeight())
                .preferredFoot(Foot.getRandomFoot())
                .skills(skill)
                .build();
    }

    private static Skill generateBadSkillLevel(){

        return new Skill.Builder()
                .acceleration(produceBadSkillLevelValue())
                .control(produceBadSkillLevelValue())
                .crossing(produceBadSkillLevelValue())
                .dribbling(produceBadSkillLevelValue())
                .header(produceBadSkillLevelValue())
                .longBall(produceBadSkillLevelValue())
                .strength(produceBadSkillLevelValue())
                .shooting(produceBadSkillLevelValue())
                .shortPass(produceBadSkillLevelValue())
                .speed(produceBadSkillLevelValue())
                .weakFoot(produceBadSkillLevelValue())
                .build();
    }

    private static Skill generateAverageSkillLevel(){

        return new Skill.Builder()
                .acceleration(produceAverageSkillLevelValue())
                .control(produceAverageSkillLevelValue())
                .crossing(produceAverageSkillLevelValue())
                .dribbling(produceAverageSkillLevelValue())
                .header(produceAverageSkillLevelValue())
                .longBall(produceAverageSkillLevelValue())
                .strength(produceAverageSkillLevelValue())
                .shooting(produceAverageSkillLevelValue())
                .shortPass(produceAverageSkillLevelValue())
                .speed(produceAverageSkillLevelValue())
                .weakFoot(produceAverageSkillLevelValue())
                .build();
    }

    private static Skill generateGoodSkillLevel(){

        return new Skill.Builder()
                .acceleration(produceGoodSkillLevelValue())
                .control(produceGoodSkillLevelValue())
                .crossing(produceGoodSkillLevelValue())
                .dribbling(produceGoodSkillLevelValue())
                .header(produceGoodSkillLevelValue())
                .longBall(produceGoodSkillLevelValue())
                .strength(produceGoodSkillLevelValue())
                .shooting(produceGoodSkillLevelValue())
                .shortPass(produceGoodSkillLevelValue())
                .speed(produceGoodSkillLevelValue())
                .weakFoot(produceGoodSkillLevelValue())
                .build();
    }

    private static Skill generateWCSkillLevel(){

        return new Skill.Builder()
                .acceleration(produceWCSkillLevelValue())
                .control(produceWCSkillLevelValue())
                .crossing(produceWCSkillLevelValue())
                .dribbling(produceWCSkillLevelValue())
                .header(produceWCSkillLevelValue())
                .longBall(produceWCSkillLevelValue())
                .strength(produceWCSkillLevelValue())
                .shooting(produceWCSkillLevelValue())
                .shortPass(produceWCSkillLevelValue())
                .speed(produceWCSkillLevelValue())
                .weakFoot(produceWCSkillLevelValue())
                .build();
    }

    private static Skill generateSSSkillLevel(){

        return new Skill.Builder()
                .acceleration(produceSSSkillLevelValue())
                .control(produceSSSkillLevelValue())
                .crossing(produceSSSkillLevelValue())
                .dribbling(produceSSSkillLevelValue())
                .header(produceSSSkillLevelValue())
                .longBall(produceSSSkillLevelValue())
                .strength(produceSSSkillLevelValue())
                .shooting(produceSSSkillLevelValue())
                .shortPass(produceSSSkillLevelValue())
                .speed(produceSSSkillLevelValue())
                .weakFoot(produceSSSkillLevelValue())
                .build();
    }

    // generates a random number between 50 - 69
    private static int produceBadSkillLevelValue(){
        return ThreadLocalRandom.current().nextInt(MIN_BAD_SKILL, MAX_BAD_SKILL + 1);
    }

    // generates a random number between 70 - 77
    private static int produceAverageSkillLevelValue(){
        return ThreadLocalRandom.current().nextInt(MIN_AVG_SKILL, MAX_AVG_SKILL + 1);
    }

    // generates a random number between 78 - 84
    private static int produceGoodSkillLevelValue(){
        return ThreadLocalRandom.current().nextInt(MIN_GOOD_SKILL, MAX_GOOD_SKILL + 1);
    }

    // generates a random number between 85 - 90
    private static int produceWCSkillLevelValue(){
        return ThreadLocalRandom.current().nextInt(MIN_WC_SKILL, MAX_WC_SKILL + 1);
    }

    // generates a random number between 91 - 95
    private static int produceSSSkillLevelValue(){
        return ThreadLocalRandom.current().nextInt(MIN_SS_SKILL, MAX_SS_SKILL + 1);
    }

    // generates a random number between 150 - 200
    private static int produceRandomWeight(){
        return ThreadLocalRandom.current().nextInt(MIN_WEIGHT, MAX_WEIGHT + 1);
    }

    // generates a random number between 152 - 195
    private static int produceRandomHeight(){
        return ThreadLocalRandom.current().nextInt(MIN_HEIGHT, MAX_HEIGHT + 1);
    }
}

