public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, float height, float weight, int strength, int aromor) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public void move() {
        System.out.println("*moving*");
    }
}