package com.imooc;

import com.imooc.domain.Girl;
import com.imooc.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author williamszhan@la-inc.cn
 * @date 2018/7/18 15:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest() {
        Girl girl = girlService.findOne(7);
        Assert.assertEquals(new Integer(22), girl.getAge());
    }
}
