package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.repository.entity.user.UserEntity;

public interface UserRepository{
    UserEntity update(UserDTO userCheckDTO);
}
