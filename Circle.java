public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a circle");
    }
    
    @Override
    public String getDescription() {
        return "This is a circle shape";
    }
}
