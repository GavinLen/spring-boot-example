package xyz.ieden.database.jdbc.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import xyz.ieden.common.entity.UserInfo;

/**
 * UserInfoDao
 *
 * @author gavin
 * @version 1.0
 * @date 2019/9/10 3:01
 */
@Repository
public class UserInfoDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoDao.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加用户
     *
     * @param userInfo
     * @return
     */
    public Integer addUserInfo(UserInfo userInfo) {
        String sqlStr = "INSERT INTO t_user (username,password,email,age,create_time) VALUES (?,?,?,?,?)";
        return jdbcTemplate.update(sqlStr, userInfo.getUsername(), userInfo.getPassword(), userInfo.getEmail(), userInfo.getAge(), userInfo.getCreateTime());
    }

}
