package ao.it.chandsoft.usersweb.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Location implements Serializable {
    private Street street;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private Coordinate coordinates;
    private Timezone timezone;
}
