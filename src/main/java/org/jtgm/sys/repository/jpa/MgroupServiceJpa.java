package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity.mgroup.MGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MgroupServiceJpa extends JpaRepository<MGroupEntity, Integer>{
    Optional<MGroupEntity> findByMGroupLeader(Integer mGroupLeader);
}
