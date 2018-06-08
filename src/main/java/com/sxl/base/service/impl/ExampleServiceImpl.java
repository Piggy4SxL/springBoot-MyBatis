package com.sxl.base.service.impl;

import com.sxl.base.dto.ExampleExection;
import com.sxl.base.entity.Example;
import com.sxl.base.exception.ExampleOperatorException;
import com.sxl.base.service.ExampleService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author SxL
 * Created on 6/6/2018 18:55.
 */
public class ExampleServiceImpl implements ExampleService {
    @Override
    @Transactional
    public ExampleExection saveExample(Example example) throws ExampleOperatorException {
        return null;
    }

    @Override
    @Transactional
    public ExampleExection updateExample(Example example) throws ExampleOperatorException {
        return null;
    }

    @Override
    public Example getExampleById(int exampleId) {
        return null;
    }


    @Override
    public List<Example> listExample(Example exampleCondition) {
        return null;
    }
}
