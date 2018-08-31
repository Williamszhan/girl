package com.imooc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author williamszhan@la-inc.cn
 * @date 2018/7/18 15:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void girlList() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/girls"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("[{\"id\":1,\"cupSize\":\"F\",\"age\":16,\"money\":0.0},{\"id\":2,\"cupSize\":\"C\",\"age\":20,\"money\":0.0},{\"id\":3,\"cupSize\":\"G\",\"age\":16,\"money\":0.0},{\"id\":5,\"cupSize\":\"B\",\"age\":19,\"money\":0.0},{\"id\":6,\"cupSize\":\"E\",\"age\":18,\"money\":0.0},{\"id\":7,\"cupSize\":\"C\",\"age\":22,\"money\":0.0},{\"id\":8,\"cupSize\":\"C\",\"age\":18,\"money\":0.0},{\"id\":9,\"cupSize\":\"C\",\"age\":18,\"money\":0.0},{\"id\":10,\"cupSize\":null,\"age\":null,\"money\":0.0}]"));
    }
}