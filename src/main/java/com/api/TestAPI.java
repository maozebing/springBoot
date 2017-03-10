package com.api;

import com.bll.ITestBLL;
import com.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.annotation.ElementType;
import java.util.List;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 2017/2/23 14:49
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
@RestController
@RequestMapping(value = "/test")
public class TestAPI {
    @Autowired
    public ITestBLL testBLL;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TestEntity getTest(@PathVariable long id) {
        return testBLL.getTest(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<TestEntity> getTests() {
        return testBLL.getTests();
    }

    @RequestMapping(value = "/list/find", method = RequestMethod.GET)
    public List<TestEntity> getTestByName(@RequestParam(value = "name") String name) {
        return testBLL.findByName(name);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addTest(@RequestBody TestEntity test){
        testBLL.addTest(test);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public void updateTest(@RequestBody TestEntity test){
        testBLL.updateTest(test);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void deleteTest(@PathVariable("id") long id){
        testBLL.deleteTest(id);
    }

}
