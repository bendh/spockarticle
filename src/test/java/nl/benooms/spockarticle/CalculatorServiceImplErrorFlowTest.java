package nl.benooms.spockarticle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceImplErrorFlowTest {

    private CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test(expected = NullPointerException.class)
    public void test_should_throw_null_pointer_when_null_operand() {
        calculatorService.add(null);
    }

    @Test
    public void test_should_throw_null_pointer_when_no_operands_supplied() {
        try {
            calculatorService.add(new int[0]);
        } catch (NullPointerException e){
            assertEquals(CalculatorServiceImpl.NO_OPERANDS_ERROR_MESSAGE, e.getMessage());
        }
    }

}