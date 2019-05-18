package com.ssm.mapper.qualitymapper;

import com.ssm.bean.qualitybean.F_Count;

import java.util.List;

public interface FCountMapper {
    List<F_Count> queryFCountList();

    List<F_Count> queryFCountByCheckId(String searchValue);

    List<F_Count> queryFCountByOrderId(String searchValue);
}
