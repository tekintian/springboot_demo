package cn.tekin.springboot01.mapper;

import cn.tekin.springboot01.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Tekin <tekintian@gmail.com>
 * @Create 2019-10-20 21:48
 */
@Mapper
public interface DepartmentMaper {

    @Select("SELECT * FROM department where id=#{id}")
    public Department getDeptById(Integer id);
}
