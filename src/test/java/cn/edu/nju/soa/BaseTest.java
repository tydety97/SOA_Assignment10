package cn.edu.nju.soa;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Base test of the application
 * @author cuihao
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = StudentApplication.class)
public class BaseTest {
}
