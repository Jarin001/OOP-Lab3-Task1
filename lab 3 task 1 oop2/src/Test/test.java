package Test;
import src.FizzyPrinter;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class test {
    FizzyPrinter printer = new FizzyPrinter();

    @Test
public void testFizzbuzzbang1(){
         assertEquals("Fizzbuzzbang", printer.printFizzy(105,false));
     }
    @Test
    public void testFizzbuzzbang2(){
        assertEquals("Fizzbuzzbang", printer.printFizzy(210,false));
    }
    @Test
    public void testFizzbuzzbang3(){
        assertEquals("Fizzbuzzbang", printer.printFizzy(315,false));
    }


    @Test
    public void testFizz1() {
        assertEquals("Fizz", printer.printFizzy(9, false));
    }
    @Test
    public void testFizz2() {
        assertEquals("Fizz", printer.printFizzy(12, false));
    }
    @Test
    public void testFizz3() {
        assertEquals("Fizz", printer.printFizzy(3, false));
    }


    @Test
    public void testBoom1() {
        assertEquals("Boom", printer.printFizzy(8, false));
    }
    @Test
    public void testBoom2() {
        assertEquals("Boom", printer.printFizzy(11, false));
    }
    @Test
    public void testBoom3() {
        assertEquals("Boom", printer.printFizzy(13, false));
    }

    @Test
    public void testFizzbuzz1() {
        assertEquals("Fizzbuzz", printer.printFizzy(15, false));
    }
    @Test
    public void testFizzbuzz2() {
        assertEquals("Fizzbuzz", printer.printFizzy(30, false));
    }
    @Test
    public void testFizzbuzz3() {
        assertEquals("Fizzbuzz", printer.printFizzy(60, false));
    }

    @Test
    public void testBuzz1(){
        assertEquals("Buzz", printer.printFizzy(5, false));
    }
    @Test
    public void testBuzz2(){
        assertEquals("Buzz", printer.printFizzy(10, false));
    }
    @Test
    public void testBuzz3(){
        assertEquals("Buzz", printer.printFizzy(20, false));
    }


    @Test
    public void testBang1(){
        assertEquals("Bang", printer.printFizzy(7, false));
    }
    @Test
    public void testBang2(){
        assertEquals("Bang", printer.printFizzy(14, false));
    }
    @Test
    public void testBang3(){
        assertEquals("Bang", printer.printFizzy(49, false));
    }

    @Test
    public void testUppercase1() {
        assertEquals("FIZZ", printer.printFizzy(9, true));
    }
    @Test
    public void testUppercase2() {
        assertEquals("BUZZ", printer.printFizzy(10, true));
    }
    @Test
    public void testUppercase3() {
        assertEquals("BANG", printer.printFizzy(7, true));
    }

}
