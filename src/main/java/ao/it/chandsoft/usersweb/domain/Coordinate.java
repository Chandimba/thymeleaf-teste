package ao.it.chandsoft.usersweb.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Coordinate implements Serializable {
    private String latitude;
    private String longitude;
}
