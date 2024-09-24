package Test;
import src.MinStack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {
    MinStack stack = new MinStack();

    @Test
    public void testcase1(){
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);

        assertEquals(1,stack.min(),1.0);
    }

    @Test
    public void testcase2(){
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.pop();

        assertEquals(2,stack.min(),1.0);
    }

    @Test
    public void testcase3(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        assertEquals(1,stack.min(),1.0);
    }
}
