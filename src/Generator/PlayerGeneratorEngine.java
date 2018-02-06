package Generator;

import Domain.Player;

public class PlayerGeneratorEngine {

    public static Player generatePlayer(String position, int level){

        switch (position){
            case "ST":
                return generateStriker(level);
            case "WNG":
                return generateWinger(level);
            case "CAM":
                return generateCam(level);
            case "OM":
                return generateOutsideMid(level);
            case "CM":
                return generateCenterMid(level);
            case "CDM":
                return generateCDM(level);
            case "FB":
                return generateFullback(level);
            case "CB":
                return generateCenterBack(level);
            case "GK":
                return generateGoalKeeper(level);
            default:
                return null;
        }
    }

    private static Player generateGoalKeeper(int level) {
        return null;
    }

    private static Player generateCenterBack(int level) {
        return null;
    }

    private static Player generateFullback(int level) {
        return null;
    }

    private static Player generateCDM(int level) {
        return null;
    }

    private static Player generateCenterMid(int level) {
        return null;
    }

    private static Player generateOutsideMid(int level) {
        return null;
    }

    private static Player generateCam(int level) {
        return null;
    }

    private static Player generateWinger(int level) {
        return null;
    }

    private static Player generateStriker(int level) {
        return null;
    }
}

