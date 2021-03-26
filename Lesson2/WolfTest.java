public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setName("Snow");
        System.out.println("Кличка: " + wolf1.getName());

        wolf1.setSex("male");
        System.out.println("Пол: " + wolf1.getSex());

        wolf1.setColor("gray");
        System.out.println("Окрас: " + wolf1.getColor());

        wolf1.setWeight(35);
        System.out.println("Вес: " + wolf1.getWeight());

        wolf1.setAge(5);
        System.out.println("Полных лет: " + wolf1.getAge());

        wolf1.howl();
    }
}