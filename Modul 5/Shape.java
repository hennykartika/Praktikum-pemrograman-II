package praktikum5.soal1;

public abstract class Shape {
    protected String shapeName;
    
    //------------------------------------
    // Constructor: Sets up the shape.
    //------------------------------------
    
    public Shape(String name) {
        shapeName = name;
    }    
    
    //--------------------------------------------
    // Returns the surface area of the shape.
    //--------------------------------------------
    
    protected abstract double area();
    
    //------------------------------------
    // Returns the shape as a String.
    //------------------------------------
    
    public String toString() {
        return shapeName;
    }
}
