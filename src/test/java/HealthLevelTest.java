import com.demo.service.HealthLevelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName HealthLevelTest
 * @Description TODO
 * @Author liangxp
 * @Date 2020/7/17 17:52
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class HealthLevelTest {
    @Autowired
    private HealthLevelService healthLevelService;

    @Test
    public void testAddHealthLevel(){
        healthLevelService.addLevel();
    }

}
