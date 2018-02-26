package com.yzx;

import com.yzx.service.LifeService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/1/29 0029.
 */
@Service
public class LifeServiceImpl implements LifeService {
    public LifeServiceImpl() {
        System.out.printf("实现类被初始化了! ");
    }


    @Override
    public String getMessage() {
        return "hello method!";
    }
}
