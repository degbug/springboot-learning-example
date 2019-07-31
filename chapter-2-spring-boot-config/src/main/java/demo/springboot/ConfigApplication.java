package demo.springboot;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 26/09/2017.
 */
@EnableSwagger2Doc // 开启 Swagger
@SpringBootApplication
public class ConfigApplication {
    //对应教程地址，https://www.bysocket.com/technique/2135.html
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
