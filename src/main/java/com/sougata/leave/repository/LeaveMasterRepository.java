package com.sougata.leave.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sougata.leave.entity.LeaveMaster;
import com.sougata.leave.repository.customrepository.LeaveMasterCustomRepository;

public interface LeaveMasterRepository extends CrudRepository<LeaveMaster, Long>,LeaveMasterCustomRepository {
    
    List<LeaveMaster> findAll();
    List<LeaveMaster> findById(Long id);
    List<LeaveMaster> findByLeaveType(String leaveType);
    @SuppressWarnings("unchecked")
    LeaveMaster save(LeaveMaster leaveMaster);
    

}
