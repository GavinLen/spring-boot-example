package xyz.ieden.base.config.component.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesListenerConfigTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesListenerConfigTest.class);

    @Test
    public void getProperty() {
        String userName = PropertiesListenerConfig.getProperty("system.user.name");
        Assert.assertNotNull(userName);
        LOGGER.info("UserName:{}.", userName);
    }

    @Test
    public void getAllProperty() {
        Map<String, String> map = PropertiesListenerConfig.getAllProperty();
        Assert.assertNotNull(map);
        LOGGER.info("Msg:{}.", map);
    }
}