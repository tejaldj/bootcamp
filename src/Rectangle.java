import org.w3c.dom.css.Rect;

// Job : Understands a 4 sided figure that has sides located at right angles.
public class Rectangle {
    private float length;
    private float breadth;

    public Rectangle(float length, float breadth) {
        if (length > 0 && breadth > 0) {
            this.length = length;
            this.breadth = breadth;
        }
        else
            throw new IllegalArgumentException("argument(s) need to be positive non zero values");
    }

    public static Rectangle createSquare(float side)  {
        return new Rectangle(side, side);
    }

    public float area() {
        return length * breadth;
    }

    public float perimeter() {
        return 2f * (length + breadth);
    }

}
