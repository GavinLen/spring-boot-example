package xyz.ieden.base.config.component.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author gavin
 * @date 2018/7/29 0:49
 */
@Component
@PropertySource(value = "classpath:properties-system.properties")
public class EnvironmentComponent {
    @Autowired
    private Environment environment;

    public String init() {
        Integer id = environment.getProperty("system.user.id", Integer.class);
        String name = environment.getProperty("system.user.name");
        Short age = environment.getProperty("system.user.age", Short.class);

        StringBuilder sb = new StringBuilder();
        sb.append("ID:").append(id).append(";");
        sb.append("Name:").append(name).append(";");
        sb.append("Age:").append(age).append(";");
        return sb.toString();
    }
}
