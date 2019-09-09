package xyz.ieden.base.config.component.properties;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author gavin
 * @date 2018/7/28 23:19
 */
@Component
@PropertySource(value = "classpath:properties-system.properties")
@ConfigurationProperties(prefix = "system.user")
public class PrefixAnnotationComponent {

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
