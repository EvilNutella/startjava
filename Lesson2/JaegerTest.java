public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger();
        robot1.setModelName("Cherno Alpha");
        System.out.println("ModelName: " + robot1.getModelName());

        robot1.setMark("Mark-1");
        System.out.println("Mark: " + robot1.getMark());

        robot1.setHeight(85.3f);
        System.out.println("Height (m): " + robot1.getHeight());

        robot1.setWeight(2.4f);
        System.out.println("Weight: " + robot1.getWeight());

        robot1.setStrength(10);
        System.out.println("Strength: " + robot1.getStrength());

        robot1.setArmor(10);
        System.out.println("Armor: " + robot1.getArmor());

        robot1.move();

        Jaeger robot2 = new Jaeger();
        robot2.setModelName("Striker Eureka");
        System.out.println("ModelName: " + robot2.getModelName());

        robot2.setMark("Mark-5");
        System.out.println("Mark: " + robot2.getMark());

        robot2.setHeight(76.2f);
        System.out.println("Height (m): " + robot2.getHeight());

        robot2.setWeight(1.9f);
        System.out.println("Weight: " + robot2.getWeight());

        robot2.setStrength(10);
        System.out.println("Strength: " + robot2.getStrength());

        robot2.setArmor(9);
        System.out.println("Armor: " + robot2.getArmor());

        robot2.move();
    }
}