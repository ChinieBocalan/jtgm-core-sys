package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPA extends JpaRepository<UserEntity, Integer> {
}
