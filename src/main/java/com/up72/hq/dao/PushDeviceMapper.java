package com.up72.hq.dao;


import com.up72.hq.model.PushDevice;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PushDeviceMapper {

    void save(PushDevice pushDevice);

    void update(PushDevice pushDevice);

    PushDevice getByTypeAndDevice(Map<String, Object> params);

    List<PushDevice> getAll();

    void  deleteBySalesMemberId(Long salesMemberId);
}
