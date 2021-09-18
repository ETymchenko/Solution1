public class TestCircle {
    public static void main(String[] args) {

        /**Создаать 1 круг с радиусом 1*/
        Circle circle1 = new Circle();
        System.out.println("Площадь круга с радиусом " + circle1.radius + " равна " + circle1.getArea());

        /**Создаать 2 круг с радиусом 25*/
        Circle circle2 = new Circle(25);
        System.out.println("Площадь круга с радиусом " + circle2.radius + " равна " + circle2.getArea());

        /**Создаать 3 круг с радиусом 125*/
        Circle circle3 = new Circle(125);
        System.out.println("Площадь круга с радиусом " + circle3.radius + " равна " + circle3.getArea());

        /**Изменить радиус круга №2*/
        circle2.setRadius(50);
        circle2.radius = 25;
        System.out.println("Площадь круга с радиусом " + circle2.radius + " равна " + circle2.getArea());
    }
}
