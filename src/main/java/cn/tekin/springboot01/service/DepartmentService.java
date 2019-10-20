package cn.tekin.springboot01.service;

import cn.tekin.springboot01.bean.Department;
import cn.tekin.springboot01.mapper.DepartmentMaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Tekin <tekintian@gmail.com>
 * @Create 2019-10-20 21:51
 */
@Service
public class DepartmentService {
    @Autowired
    DepartmentMaper departmentMaper;

    public Department getDept(Integer id) {
        Department dept = departmentMaper.getDeptById(id);
        return  dept;
    }
}
