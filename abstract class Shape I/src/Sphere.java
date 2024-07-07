
	public class Sphere extends Shape {
	    private double radius;

	    // Parameterized constructor to initialize radius
	    public Sphere(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate surface area
	    @Override
	    public double surfaceArea() {
	        return 4 * Math.PI * Math.pow(radius, 2);
	    }

	    // Method to calculate volume
	    @Override
	    public double volume() {
	        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
	    }

	    // toString method to print surface area and volume
	    @Override
	    public String toString() {
	        return "Sphere: Surface Area = " + surfaceArea() + ", Volume = " + volume();
	    }
	}


