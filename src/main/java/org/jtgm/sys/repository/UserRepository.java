package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.repository.entity.user.UserEntity;

public interface UserRepository {

    UserEntity getUserDetails();

    UserEntity update(UserDTO userDTO);
}
