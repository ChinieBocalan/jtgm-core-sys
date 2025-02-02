package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.repository.entity.user.UserEntity;
import java.util.List;

public interface UserRepository {
    UserEntity update (UserDTO userDTO);
    List<UserEntity> getUserDetails();
}
