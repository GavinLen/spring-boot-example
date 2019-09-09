package xyz.ieden.base.config.component.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvironmentComponentTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentComponentTest.class);

    @Autowired
    private EnvironmentComponent component;

    @Test
    public void init() {
        String msg = component.init();
        Assert.assertNotNull(msg);
        LOGGER.info("Msg:{}.", msg);
    }
}