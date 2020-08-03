import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName App
 * @Description Sharding-Sphere 入门案例
 * @Author liangxp
 * @Date 2020/7/12 20:58
 **/
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = "com.demo")
@MapperScan(basePackages = {"com.demo.dao"})
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class,args);
    }
}
