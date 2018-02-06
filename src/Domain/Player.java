package Domain;

public class Player {

    private String name;
    private String position;
    private int number;
    private int height;
    private int weight;
    private String preferredFoot;
    private Skill skills;

    public Player(String name, String position, int number, int height, int weight, String preferredFoot, Skill skills){

        this.number = number;
        this.name = name;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.preferredFoot = preferredFoot;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
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

    public String getPreferredFoot() {
        return preferredFoot;
    }
}
