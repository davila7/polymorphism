public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a square");
    }
    
    @Override
    public String getDescription() {
        return "This is a square shape";
    }
}
