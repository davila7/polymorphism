public abstract class Shape {
    public abstract void draw(); // Abstract method to enforce implementation in subclasses
    public abstract void erase(); // Añadir este método abstracto
    public abstract String get_description(); // Nuevo método abstracto

    public void resize(double factor) {
        // Implement resizing logic here
    }
}
