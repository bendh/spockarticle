package nl.benooms.spockarticle

import spock.lang.Specification

/**
 * Created by booms on 29-12-16.
 */
class CalculatorServiceSpec extends Specification {

    def calculatorService = new CalculatorServiceImpl()

    def "Add"() {
        expect:
            assert calculatorService.add() == 0
    }
}
