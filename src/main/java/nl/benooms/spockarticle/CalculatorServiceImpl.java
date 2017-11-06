package nl.benooms.spockarticle;

import java.util.Objects;


public class CalculatorServiceImpl  implements CalculatorService{

    public static final String NO_OPERANDS_ERROR_MESSAGE = "at least one operand should be supplied";

    public int add(int... operands) {
        Objects.requireNonNull(operands, NO_OPERANDS_ERROR_MESSAGE);
        int result = 0;
        if (operands.length > 0){
            for (int i : operands){
                result += i;
            }
        } else {
            throw new NullPointerException(NO_OPERANDS_ERROR_MESSAGE);
        }
        return result;
    }
}
