package org.jtgm.sys.core.service;

import org.jtgm.sys.core.dto.UserDTO;

public interface UserService {


    UserDTO getUserDetails();
    UserDTO update(UserDTO userDTO);
}

