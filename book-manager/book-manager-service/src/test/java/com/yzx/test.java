package com.yzx;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzx.dao.TbItemMapper;
import com.yzx.entity.TbItem;
import com.yzx.entity.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by yzx on 2018/3/20.
 */
public class test {
    @Test
    public void test() {
        //初始化spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        //从容器中获取mapper代理对象
        TbItemMapper itemMapper = context.getBean(TbItemMapper.class);
        TbItem tbItem = itemMapper.selectByPrimaryKey(666l);
        /*//执行sql语句之前设置分页信息，使用pageHelper中的startPage方法
        PageHelper.startPage(1,10);
        //执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> tbItems = itemMapper.selectByExample(example);
        //取分页信息   pageInfo(总记录数  总页数  当前页码  ---)
        PageInfo<TbItem> pageInfo = new PageInfo<>(tbItems);
        System.out.println( pageInfo.getTotal() + " : " +  tbItems.size());*/
    }
}
