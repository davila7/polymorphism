public class Main {
    public static void main(String[] args) {
        // Create an array of Shapes (polymorphism)
        Shape[] shapes = { new Circle(), new Square() };

        // Draw all shapes without knowing their specific type
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}