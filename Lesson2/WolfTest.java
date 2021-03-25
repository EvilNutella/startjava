public class WolfTest {
    public static void main(String[] args) {
    Wolf wolf1 = new Wolf();
    wolf1.name = "Snow";
    System.out.println("Кличка: " + wolf1.name);

    wolf1.sex = "male";
    System.out.println("Пол: " + wolf1.sex);

    wolf1.color = "gray";
    System.out.println("Окрас: " + wolf1.color);

    wolf1.weight = 35;
    System.out.println("Вес: " + wolf1.weight);

    wolf1.age = 5;
    System.out.println("Полных лет: " + wolf1.age);

    wolf1.howl();

    }
}