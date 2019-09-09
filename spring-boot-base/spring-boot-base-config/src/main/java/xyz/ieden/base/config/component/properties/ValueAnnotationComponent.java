package xyz.ieden.base.config.component.properties;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * a
 *
 * @author gavin
 * @version 1.0
 * @date 2019/9/10 1:07
 */
@Component
@PropertySource(value = "classpath:properties-system.properties")
public class ValueAnnotationComponent {

    @Value(value = "${system.user.id}")
    private Integer id;
    @Value(value = "${system.user.name}")
    private String name;
    @Value(value = "${system.user.age}")
    private Short age;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
