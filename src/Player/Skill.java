package Player;

public class Skill {

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

    private Skill(Builder builder) {
        this.shortPass = builder.shortPass;
        this.longBall = builder.longBall;
        this.shooting = builder.shooting;
        this.crossing = builder.crossing;
        this.acceleration = builder.acceleration;
        this.speed = builder.speed;
        this.control = builder.control;
        this.header = builder.header;
        this.strength = builder.strength;
        this.dribbling = builder.dribbling;
        this.weakFoot = builder.weakFoot;
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

    @Override
    public String toString() {
        return "  Skill{" +
                "shortPass=" + shortPass +
                ", longBall=" + longBall +
                ", shooting=" + shooting +
                ", crossing=" + crossing +
                ", acceleration=" + acceleration +
                ", speed=" + speed +
                ", control=" + control +
                ", header=" + header +
                ", strength=" + strength +
                ", dribbling=" + dribbling +
                ", weakFoot=" + weakFoot +
                '}';
    }

    public static class Builder{

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

        public Builder shortPass(int shortPass) {
            this.shortPass = shortPass;
            return this;
        }

        public Builder longBall(int longBall) {
            this.longBall = longBall;
            return this;
        }

        public Builder shooting(int shooting) {
            this.shooting = shooting;
            return this;
        }

        public Builder crossing(int crossing) {
            this.crossing = crossing;
            return this;
        }

        public Builder acceleration(int acceleration) {
            this.acceleration = acceleration;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder control(int control) {
            this.control = control;
            return this;
        }

        public Builder header(int header) {
            this.header = header;
            return this;
        }

        public Builder strength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder dribbling(int dribbling) {
            this.dribbling = dribbling;
            return this;
        }

        public Builder weakFoot(int weakFoot) {
            this.weakFoot = weakFoot;
            return this;
        }

        public Skill build(){
            return new Skill(this);
        }
    }
}
