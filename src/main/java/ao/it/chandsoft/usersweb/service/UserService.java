package ao.it.chandsoft.usersweb.service;

import ao.it.chandsoft.usersweb.domain.User;
import ao.it.chandsoft.usersweb.domain.dto.Page;

public interface UserService {

    public Page<User> findAll(int page, int size);

}
