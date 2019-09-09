package xyz.ieden.base.config.component.yaml;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author gavin
 * @date 2018/7/29 1:55
 */
@Component
@PropertySource(value = "classpath:yml-system.yml")
@ConfigurationProperties(prefix = "yml")
public class YmlComponent {
    private Integer id;
    private String name;
    private Short age;

    // Setter and Getter Method

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
