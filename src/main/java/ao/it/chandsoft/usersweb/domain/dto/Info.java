package ao.it.chandsoft.usersweb.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Info implements Serializable {
    private String seed;
    private long results;
    private int page;
    private String version;
}
