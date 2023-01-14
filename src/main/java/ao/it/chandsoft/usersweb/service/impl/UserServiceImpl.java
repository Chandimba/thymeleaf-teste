package ao.it.chandsoft.usersweb.service.impl;

import ao.it.chandsoft.usersweb.domain.User;
import ao.it.chandsoft.usersweb.domain.dto.Page;
import ao.it.chandsoft.usersweb.domain.dto.RequestDTO;
import ao.it.chandsoft.usersweb.http.Request;
import ao.it.chandsoft.usersweb.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Request httpRequest = new Request();

    @Override
    public Page<User> findAll(int page, int size) {
        RequestDTO objects = httpRequest.get("https://randomuser.me/api/?page=" + page +"&results=" + size, RequestDTO.class);
        return new Page<User>(page, size, objects.getResults());
    }
}
