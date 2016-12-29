package nl.benooms.spockarticle

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by booms on 29-12-16.
 */
class CalculatorServiceSpec extends Specification {

    def calculatorService = new CalculatorServiceImpl()

    def "Add should throw message when operands is null" () {
        when:
            calculatorService.add(null)
        then:
            def error = thrown(NullPointerException.class)
            assert error.message == "at least one operand should be supplied"
    }

    def "Add should throw message when no operands are provided" () {
        when:
        calculatorService.add(new int[0])
        then:
        def error = thrown(NullPointerException.class)
        assert error.message == "at least one operand should be supplied"
    }

    @Unroll
    "When #operands are provided #result is expected" () {
        expect:
            assert calculatorService.add(operands) == result
        where:
        operands           || result
        [1,2] as int[]     || 3
        [3]  as int[]      || 3
        [10,12,2] as int[] || 24
    }


}
