package com.macro.mall.tiny;
//运行开始的地方！！接口地址：http://localhost:8080/swagger-ui.html
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallTinyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallTinyApplication.class, args);
    }

}
//SpringApplication.run一共做了两件事
//
//        创建SpringApplication对象；在对象初始化时保存事件监听器，容器初始化类以及判断是否为web应用，保存包含main方法的主配置类。
//        调用run方法；准备spring的上下文，完成容器的初始化，创建，加载等。会在不同的时机触发监听器的不同事件。
