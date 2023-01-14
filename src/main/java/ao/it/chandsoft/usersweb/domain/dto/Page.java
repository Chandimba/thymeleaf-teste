package ao.it.chandsoft.usersweb.domain.dto;

import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class Page<T> {

    private int page;
    private int size;
    private int numberOfElements;
    private List<T> content;

    public Page(int page, int size, List<T> results) {
        this.page = page;
        this.size = size;
        this.content = results;
        this.numberOfElements = Objects.nonNull(content)? content.size(): 0;
    }

}
