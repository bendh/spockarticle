package nl.benooms.spockarticle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CalculatorServiceImplTest {

    private CalculatorService calculatorService = new CalculatorServiceImpl();

    private TestParams testParams;

    public CalculatorServiceImplTest(TestParams testParams) {
        this.testParams = testParams;
    }

//    @Test(expected = NullPointerException.class)
//    public void test_should_throw_null_pointer_when_null_operand() {
//        calculatorService.add(null);
//    }
//
//    @Test
//    public void test_should_throw_null_pointer_when_no_operands_supplied() {
//        try {
//            calculatorService.add(new int[0]);
//        } catch (NullPointerException e){
//            assertEquals(CalculatorServiceImpl.NO_OPERANDS_ERROR_MESSAGE, e.getMessage());
//        }
//    }

    @Test
    public void test_with_different_operands(){
        assertEquals(calculatorService.add(testParams.operands), testParams.expectedResults);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[] { new TestParams(new int[]{1,2}, 3) },
                             new Object[] { new TestParams(new int[]{3}, 3) },
                             new Object[] { new TestParams(new int[]{10,12,2}, 24) });
    }


    public static class TestParams {
        private int[] operands;
        private int expectedResults;

        public TestParams(int[] operands, int expectedResults) {
            this.operands = operands;
            this.expectedResults = expectedResults;
        }
    }





}