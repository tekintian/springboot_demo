package cn.tekin.springboot01.service;

import cn.tekin.springboot01.bean.Employee;
import cn.tekin.springboot01.mapper.EmployeeMaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Tekin <tekintian@gmail.com>
 * @Create 2019-10-19 18:49
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMaper employeeMaper;

    public Employee getEmp(int id) {
        Employee emp = employeeMaper.getEmpById(id);
        return emp;
    }
}
