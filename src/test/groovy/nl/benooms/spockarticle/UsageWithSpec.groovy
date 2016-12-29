package nl.benooms.spockarticle

import nl.benooms.spockarticle.domain.Car
import spock.lang.Specification

/**
 * Created by booms on 29-12-16.
 */
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
                make == make
                model == model
                color == color
            }
    }

}