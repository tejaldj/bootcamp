import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

//Job : Ensures the correctness of Rectangle class
public class RectangleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test//(expected = IllegalArgumentException.class)
    public void throwsExceptionWhenCreatingRectangleOfLengthLessThanZero(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("argument(s) need to be positive non zero values");
        new Rectangle(-2, 2);
    }

    @Test//(expected = IllegalArgumentException.class)
    public void throwsExceptionWhenCreatingSquareofLengthLessThanZero(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("argument(s) need to be positive non zero values");
        Rectangle.createSquare(-2);
    }

    @Test
    public void shouldReturn20AsAreaForRectangleWithLength2AndBreadth10(){
        Rectangle rectangle = new Rectangle(2, 10);
        Assert.assertEquals(20f, rectangle.area(), 0.0);
    }

    @Test
    public void shouldReturn21AsAreaForRectangleWithLength2_1AndBreadth10(){
        Rectangle rectangle = new Rectangle(2.1f, 10.1f);
        Assert.assertEquals(21.21f, rectangle.area(), 0.0);
    }

    @Test
    public void shouldReturn24AsPerimeterForRectangleWithLength2AndBreadth10(){
        Rectangle rectangle = new Rectangle(2, 10);
        Assert.assertEquals(24, rectangle.perimeter(), 0.0);
    }

    @Test
    public void shouldReturn21_1AsPerimeterForRectangleWithLength2_1AndBreadth10(){
        Rectangle rectangle = new Rectangle(2.1f, 10);
        Assert.assertEquals(24.200000762939453f, rectangle.perimeter(), 0.0000007);
    }

}
