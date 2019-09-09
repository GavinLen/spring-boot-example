package xyz.ieden.base.config.component.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author gavin
 * @date 2018/7/29 1:19
 */
@Component
public class PropertiesListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesListener.class);

    /**
     * 监听 ApplicationStartedEvent 事件
     *
     * @param event
     */
    @EventListener
    public void listenerApplicationStartedEvent(ApplicationStartedEvent event) {
        LOGGER.info("Listener Application Started Event.");
        LOGGER.info(event.toString());

        try {
            PropertiesListenerConfig.processProperties("properties-system.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
