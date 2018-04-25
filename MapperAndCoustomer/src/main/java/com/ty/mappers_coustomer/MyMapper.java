package com.ty.mappers_coustomer;
import com.ty.entities.Employee;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;
/**
* @Description: 继承的那部分可以自由选择父类接口进行集成，可以更具实际的功能进行继承
* @ClassName: MyMapper.java
* @version: v1.0.0
* @author: 
* @date: 2018年1月1日 下午4:41:45
 */
public interface MyMapper<T> extends 
SelectAllMapper<Employee>, SelectByExampleMapper<Employee> {

}
