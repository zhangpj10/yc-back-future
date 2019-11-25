package com.yc.test.repository;

import com.yc.common.mybatis.repository.MyBatisRepository;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

@MyBatisRepository
public interface TestMapper {

    HashMap getUser(@Param("id") int id);
}
