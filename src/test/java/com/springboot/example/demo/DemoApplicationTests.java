package com.springboot.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("啊啊啊！");
    }

    @Test
    public void sayHello(){
//        new SayHello().sayHello();
        boolean aa=true;
        boolean bb=false;
        boolean cc=aa&&bb;
        System.out.println(cc);
    }


}
