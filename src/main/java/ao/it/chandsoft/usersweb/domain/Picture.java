package ao.it.chandsoft.usersweb.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Picture implements Serializable {
    private String large;
    private String medium;
    private String thumbnail;
}
