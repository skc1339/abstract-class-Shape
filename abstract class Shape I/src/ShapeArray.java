
public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate one sphere, one cylinder, and one cone
        Sphere sphere = new Sphere(5);
        Cylinder cylinder = new Cylinder(3, 7);
        Cone cone = new Cone(4, 6);

        // Store the class instances into an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print out the instance data
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}



