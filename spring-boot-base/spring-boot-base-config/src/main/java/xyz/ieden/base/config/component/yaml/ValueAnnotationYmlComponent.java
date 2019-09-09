package xyz.ieden.base.config.component.yaml;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author gavin
 * @date 2018/7/29 2:00
 */
@Component
@PropertySource(value = "classpath:yml-system.yml")
public class ValueAnnotationYmlComponent {
    @Value(value = "${yml:id}")
    private Integer id;
    @Value(value = "${yml:name}")
    private String name;
    @Value(value = "${yml:age}")
    private Short age;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}