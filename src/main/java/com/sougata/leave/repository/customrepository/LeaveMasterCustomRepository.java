package com.sougata.leave.repository.customrepository;

import com.sougata.leave.entity.LeaveMaster;

public interface LeaveMasterCustomRepository {

    public void add(LeaveMaster leaveMaster);

    public void deleteLeaveMaster(Long id);

    LeaveMaster getById(Long id);


}
