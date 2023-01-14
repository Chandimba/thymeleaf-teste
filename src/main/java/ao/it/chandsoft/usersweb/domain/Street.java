package ao.it.chandsoft.usersweb.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Street implements Serializable {
    private int number;
    private String name;
}
