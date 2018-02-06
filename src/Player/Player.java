package Player;

import Values.Foot;
import Values.Position;

public class Player{

    private String name;
    private Position position;
    private int number;
    private int height; // centimeter
    private int weight; // lbs
    private Foot preferredFoot;
    private Skill skills;

    private Player(Builder builder){
        this.number = builder.number;
        this.name = builder.name;
        this.position = builder.position;
        this.height = builder.height;
        this.weight = builder.weight;
        this.preferredFoot = builder.preferredFoot;
        this.skills = builder.skills;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Foot getPreferredFoot() {
        return preferredFoot;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", height=" + height +
                ", weight=" + weight +
                ", preferredFoot='" + preferredFoot + '\'' +
                "," + skills.toString() +
                '}';
    }

    public static class Builder{
        private String name;
        private Position position;
        private int number;
        private int height;
        private int weight;
        private Foot preferredFoot;
        private Skill skills;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder position(Position position){
            this.position = position;
            return this;
        }

        public Builder number(int number){
            this.number = number;
            return this;
        }

        public Builder height(int height){
            this.height = height;
            return this;
        }

        public Builder weight(int weight){
            this.weight = weight;
            return this;
        }

        public Builder preferredFoot(Foot foot){
            preferredFoot = foot;
            return this;
        }

        public Builder skills(Skill skill){
            skills = skill;
            return this;
        }

        public Player build(){
            return new Player(this);
        }
    }
}
