package com.gxa.mapper;

import com.gxa.entity.Community;
import com.gxa.entity.Emp;
import java.util.List;

public interface EmpMapper {
    List<Community> queryAllComm();
    List<Emp> queryAll();
    void save(Emp emp);
    Emp queryByEmpno(Integer empno);
    void saveComm(Community community);
    void update(Emp emp);
    void updateComm(Community community);
    void deleteByEmpno(Integer empno);
    void deleteByid(Integer empno);
}
