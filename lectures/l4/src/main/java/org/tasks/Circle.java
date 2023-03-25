public class Circle {
    public double radius;
    public String color;
    public double area() {
        return radius * radius * 3.14;
    }

    public double perimetr() {
        return 2 * 3.14 * radius;
    }

    public void Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String sc = "Круг с радиусом " + radius + ", цвета " + color + ", площадью " + area() + ", периметром " + perimetr();
        return sc;
    }
}
