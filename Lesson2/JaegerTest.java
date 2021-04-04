public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger("Cherno Alpha", "Mark-1", 85.3f, 2.4f, 10, 10);
        System.out.println("ModelName: " + robot1.getModelName());

        System.out.println("Mark: " + robot1.getMark());

        System.out.println("Height (m): " + robot1.getHeight());

        System.out.println("Weight: " + robot1.getWeight());

        System.out.println("Strength: " + robot1.getStrength());

        System.out.println("Armor: " + robot1.getArmor());

        robot1.move();

        Jaeger robot2 = new Jaeger("Striker Eureka", "Mark-5", 76.2f, 1.9f, 10, 9);
        System.out.println("ModelName: " + robot2.getModelName());

        System.out.println("Mark: " + robot2.getMark());

        System.out.println("Height (m): " + robot2.getHeight());

        System.out.println("Weight: " + robot2.getWeight());

        System.out.println("Strength: " + robot2.getStrength());

        System.out.println("Armor: " + robot2.getArmor());

        robot2.move();
    }
}