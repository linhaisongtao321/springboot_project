package com.lhst.springboot_project;

import com.lhst.springboot_project.beans.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootProjectApplicationTests {

    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.print(person);
    }

}
