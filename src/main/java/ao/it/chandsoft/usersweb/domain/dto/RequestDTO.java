package ao.it.chandsoft.usersweb.domain.dto;

import ao.it.chandsoft.usersweb.domain.User;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RequestDTO implements Serializable {

    private Info info;
    private List<User> results;

}
