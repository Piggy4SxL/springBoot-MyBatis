package com.sxl.base.dao;

import com.sxl.base.entity.Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SxL
 *         Created on 2018/6/6.
 */
public interface ExampleDao {
    int insertExample(Example example);

    int updateExample(Example example);

    Example getExampleById(int exampleId);

    List<Example> listExample(@Param("exampleCondition") Example exampleCondition, @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);
}
