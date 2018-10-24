import org.junit.Assert;
import org.junit.Test;
import сalculator2.Addition;
import сalculator2.Division;
import сalculator2.Multiplication;
import сalculator2.Subtraction;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Addition addition = new Addition(4, 5);
        Assert.assertEquals(9, addition.calculateResuit(), 0);
    }

    @Test
    public void testDivision() {
        Division division = new Division(4, 2);
        Assert.assertEquals(2, division.calculateResuit(), 0);

    }

    @Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction(4, 2);
        Assert.assertTrue("При вычитании получина ошибка. Получено значение[%s]. Ожидалось 2.", subtraction.calculateResuit()==2);

    }

    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication(4, 2);
        Assert.assertEquals(8, multiplication.calculateResuit(), 0);

    }
}
