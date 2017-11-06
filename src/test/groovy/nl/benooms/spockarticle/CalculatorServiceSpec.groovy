package nl.benooms.spockarticle

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll


class CalculatorServiceSpec extends Specification {

    def calculatorService = new CalculatorServiceImpl()

    def "Add should throw message when operands is null" () {
        setup:
            def operand = null
        when:
            calculatorService.add(operand)
        then:
            def error = thrown(NullPointerException.class)
            assert error.message == CalculatorServiceImpl.NO_OPERANDS_ERROR_MESSAGE
        printf calculatorService.toString()
    }

    def "Add should throw message when no operands are provided" () {
        given: "A operand containing a empty array"
            def operand = new int[0]
        when:
        calculatorService.add(operand)
        then:
        def error = thrown(NullPointerException.class)
        assert error.message == "at least one operand should be supplied"
        printf calculatorService.toString()
    }

    @Unroll
    "When #operands are provided #result is expected" () {
        expect:
            assert calculatorService.add(operands) == result
        printf calculatorService.toString()
        where:
        operands           || result
        [1,2] as int[]     || 3
        [3]  as int[]      || 3
        [10,12,2] as int[] || 24
    }


}
