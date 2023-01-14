package ao.it.chandsoft.usersweb.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private Registration dob;
    private Registration registered;
    private String phone;
    private String cell;
    private Id id;
    private Picture picture;
    private String nat;
}
