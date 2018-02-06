package Domain;

class Skill {

    private int shortPass;
    private int longBall;
    private int shooting;
    private int crossing;
    private int acceleration;
    private int speed;
    private int control;
    private int header;
    private int strength;
    private int dribbling;
    private int weakFoot;

    public Skill(int shortPass, int longBall, int shooting, int crossing, int acceleration, int speed, int control, int header, int strength, int dribbling, int weakFoot) {
        this.shortPass = shortPass;
        this.longBall = longBall;
        this.shooting = shooting;
        this.crossing = crossing;
        this.acceleration = acceleration;
        this.speed = speed;
        this.control = control;
        this.header = header;
        this.strength = strength;
        this.dribbling = dribbling;
        this.weakFoot = weakFoot;
    }

    public int getShortPass() {
        return shortPass;
    }

    public int getLongBall() {
        return longBall;
    }

    public int getShooting() {
        return shooting;
    }

    public int getCrossing() {
        return crossing;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getSpeed() {
        return speed;
    }

    public int getControl() {
        return control;
    }

    public int getHeader() {
        return header;
    }

    public int getStrength() {
        return strength;
    }

    public int getDribbling() {
        return dribbling;
    }

    public int getWeakFoot() {
        return weakFoot;
    }
}
