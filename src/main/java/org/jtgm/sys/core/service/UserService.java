package org.jtgm.sys.core.service;

import org.jtgm.sys.core.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO update (UserDTO userDTO);
    List<UserDTO> getUserDetails();

}
