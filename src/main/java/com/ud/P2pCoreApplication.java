package com.ud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * 注意这个main方法中的启动类会影响引入这个jar的启动,特别是Mapper借口实现类的对象
 * 如果有两个@MapperScan注解同时在这个jar和引入的项目中,那么创建该Mapper借口的对象的时候就会出现
 * bean重复定义的警告
 * @author Simon_Xu
 *
 */
@SpringBootApplication
@ComponentScan({"com.ud.base.service"})
@EnableJpaRepositories("com.ud.base.dao")
//@MapperScan("com.ud.base.mapper")//如果同时都在两个项目中添加这个注解,会出现bean has been defined with the same name
public class P2pCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2pCoreApplication.class, args);
	}
}
