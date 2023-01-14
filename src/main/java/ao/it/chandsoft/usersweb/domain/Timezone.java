package ao.it.chandsoft.usersweb.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Timezone implements Serializable {
    private String offset;
    private String description;
}
