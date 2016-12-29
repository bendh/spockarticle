package nl.benooms.spockarticle.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Created by booms on 29-12-16.
 */
@Data
@Builder
public class Car {
    String make, model, color;
}
