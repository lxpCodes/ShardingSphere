import com.demo.service.HealthRecordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

/**
 * @ClassName HealthRecordTest
 * @Description TODO
 * @Author liangxp
 * @Date 2020/7/17 17:55
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class HealthRecordTest {

    @Autowired
    private HealthRecordService healthRecordService;

    @Test
    public void testAddRecord() throws SQLException {
        healthRecordService.processHealthRecords();
    }
}
