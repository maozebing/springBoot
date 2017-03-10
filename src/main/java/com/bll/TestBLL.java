package com.bll;

import com.dal.ITestDAL;
import com.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
@Service
@Transactional
public class TestBLL implements ITestBLL {

    @Resource
    private ITestDAL testDAL;

    @Override
    public TestEntity getTest(long id) {
        return testDAL.findOne(id);
    }

    @Override
    public List<TestEntity> getTests() {
        return testDAL.findAll();
    }

    @Override
    public void addTest(TestEntity entity) {
        testDAL.save(entity);
    }

    @Override
    public void updateTest(TestEntity entity) {
        testDAL.save(entity);
    }

    @Override
    public void deleteTest(long id) {
        testDAL.delete(id);
    }

    @Override
    public List<TestEntity> findByName(String name) {
        return testDAL.findByName(name);
    }
}
