package ao.it.chandsoft.usersweb.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Id implements Serializable {
    private String name;
    private String value;
}
