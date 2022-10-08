package com.gxa.service;

import com.gxa.entity.Community;
import com.gxa.entity.Dept;
import com.gxa.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> queryAll();
    List<Community>  queryAllComm();
    List<Dept> queryDepts();
    void add(Emp emp);
    void addComm(Community community);
    Emp queryByEmpno(Integer empno);
    void updateComm(Community community);
    void update(Emp emp);
    void deleteCommid(Integer id);
    void delete(Integer empno);
}
