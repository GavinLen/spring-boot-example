package xyz.ieden.base.config.component.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValueAnnotationComponentTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValueAnnotationComponentTest.class);

    @Autowired
    private ValueAnnotationComponent component;

    @Test
    public void tesToString() {
        String msg = component.toString();
        Assert.assertNotNull(msg);
        LOGGER.info("Msg:{}.", msg);
    }

}