package nl.benooms.spockarticle.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    String make, model, color;
}
