package ao.it.chandsoft.usersweb;

import ao.it.chandsoft.usersweb.domain.dto.RequestDTO;
import ao.it.chandsoft.usersweb.http.Request;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersWebApplicationTests {

    private Request request;

    @BeforeEach
    public void init() {
        request = new Request();
    }

    @Test
    void shouldBeNotNull() {
        RequestDTO objects = request.get("https://randomuser.me/api/?page=0&results=10", RequestDTO.class);
        Assertions.assertNotNull(objects);
    }

    @Test
    void shouldReturns100Users() {
        RequestDTO objects = request.get("https://randomuser.me/api/?page=0&results=100", RequestDTO.class);
        Assertions.assertEquals(100, objects.getResults().size());
    }

}
