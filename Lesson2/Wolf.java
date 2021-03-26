public class Wolf {
    private String name;
    private String sex;
    private String color;
    private int weight;
    private int age;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }
    
    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age < 8) {
            System.out.println("Некорректный возраст");
        } else {
        this.age = age;
        }
    }
    
    public void walk() {}

    public void sit() {}

    public void run() {}

    public void howl() {
        System.out.println("Woooo");
    }

    public void hunt() {}
}