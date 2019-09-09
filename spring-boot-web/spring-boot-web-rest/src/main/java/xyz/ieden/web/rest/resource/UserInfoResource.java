package xyz.ieden.web.rest.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.common.entity.Result;
import xyz.ieden.common.entity.UserInfo;
import xyz.ieden.common.util.ResultUtils;

import java.util.Date;

/**
 * HelloResource
 *
 * @author gavin
 * @version 1.0
 * @date 2019/9/10 2:39
 */
@RestController
@RequestMapping(value = "userInfo")
public class UserInfoResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoResource.class);

    @GetMapping(value = "{id}")
    public Result<UserInfo> getUserInfoById(@PathVariable(name = "id", required = true) Integer id) {
        LOGGER.info("Request Data By Id [{}].", id);
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setUsername("tom_" + id);
        userInfo.setPassword("123123");
        userInfo.setCreateTime(new Date());
        return ResultUtils.getResult(userInfo);
    }

}
