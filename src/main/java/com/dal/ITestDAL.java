package com.dal;

import com.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 2017/2/23 13:49
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public interface ITestDAL extends JpaRepository<TestEntity,Long> {
    @Query("select t from TestEntity t where t.name = ?1")
     List<TestEntity> findByName(String name);
}