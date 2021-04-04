public class Jaeger {
    String modelName;
    String mark;
    float height;
    float weight;
    int strength;
    int armor;

    void setModelName(String name) {
        this.modelName = name;
    }

    public String getModelName() {
        return modelName;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void move() {
        System.out.println("*moving*");
    }
}