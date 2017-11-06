package nl.benooms.spockarticle;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;


public class CalculatorServiceImpl  implements CalculatorService{

    public static final String NO_OPERANDS_ERROR_MESSAGE = "at least one operand should be supplied";

    public int add(int... operands) {
        Objects.requireNonNull(operands, NO_OPERANDS_ERROR_MESSAGE);
        int result;
        if (operands.length > 0){
            result = IntStream.of(operands).sum();
        } else {
            throw new NullPointerException(NO_OPERANDS_ERROR_MESSAGE);
        }
        return result;
    }
}
