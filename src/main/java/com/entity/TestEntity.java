package com.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 2017/1/6 19:46
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
@Entity
@Table(name = "t_test")
public class TestEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
