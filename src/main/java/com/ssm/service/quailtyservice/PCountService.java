package com.ssm.service.quailtyservice;

import com.ssm.bean.qualitybean.P_Count;

import java.util.List;

public interface PCountService {
    List<P_Count> queryPCountList();

    List<P_Count> queryPCountByCheckId(String searchValue);

    List<P_Count> queryPCountByOrderId(String searchValue);

    int deletePCount(String[] ids);

    int upadtePCount(P_Count pCount);

    int insertPCount(P_Count pCount);
}
