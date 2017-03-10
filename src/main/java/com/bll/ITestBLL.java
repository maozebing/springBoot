package com.bll;

import com.entity.TestEntity;

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
public interface ITestBLL {
    TestEntity getTest(long id);
    List<TestEntity> getTests();
    void addTest(TestEntity entity);
    void updateTest(TestEntity entity);
    void deleteTest(long id);
    List<TestEntity> findByName(String name);
}
