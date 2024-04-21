
    public class Geometry {
    public Shape createShape(String type) {
        switch (type) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

