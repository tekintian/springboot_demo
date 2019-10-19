package cn.tekin.springboot01.mapper;

import cn.tekin.springboot01.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Tekin <tekintian@gmail.com>
 * @Create 2019-10-19 18:27
 */
@Mapper
public interface EmployeeMaper {

    @Select("SELECT * FROM employee WHERE id=#{id}")
    public Employee getEmpById(Integer id);

}
