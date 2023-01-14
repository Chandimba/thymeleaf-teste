package ao.it.chandsoft.usersweb.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Registration implements Serializable {
    private LocalDateTime date;
    private int age;
}
