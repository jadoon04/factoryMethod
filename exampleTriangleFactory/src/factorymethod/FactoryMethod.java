
package factorymethod;


public class FactoryMethod {

   
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        
        Geometry geometry = new Geometry();
        
        shapes.add(geometry.createShape("Circle"));
        shapes.add(geometry.createShape("Square"));
        shapes.add(geometry.createShape("Square"));
        shapes.add(geometry.createShape("Triangle"));
        
        for (Shape s : shapes) {
            s.draw();
        }
    }
}

    
    

