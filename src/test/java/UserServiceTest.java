import com.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName UserServiceTest
 * @Description 用户测试类
 * @Author liangxp
 * @Date 2020/7/17 16:52
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser(){
        userService.addNewUser();
    }
}
