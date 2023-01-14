package ao.it.chandsoft.usersweb.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "team")
public class Team implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    @NotBlank(message = "The team name must be filled")
    private String name;
    @NotBlank(message = "The team country is required")
    private String country;
    @NotBlank(message = "The team site is required")
    private String site;
    @NotBlank(message = "The team stadium is required")
    private String stadium;

    @PrePersist
    public void init() {
        id = UUID.randomUUID();
    }
}
