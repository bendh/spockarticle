package nl.benooms.spockarticle

import nl.benooms.spockarticle.domain.Car
import spock.lang.Specification


class UsageWithSpec extends Specification {

    def "Sample usage of with keyword"() {
        given:
            def make = 'renault'
            def model = 'megane'
            def color = 'blue'
        when:
            def result = Car.builder()
                                .make(make)
                                .model(model)
                                .color(color)
                            .build()
        then:
            with(result) {
                result.make == make
                result.model == model
                result.color == color
            }
    }

}