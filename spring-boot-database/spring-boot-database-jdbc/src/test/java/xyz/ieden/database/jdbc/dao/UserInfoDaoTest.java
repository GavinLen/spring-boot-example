package xyz.ieden.database.jdbc.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.ieden.common.entity.UserInfo;

import java.util.Objects;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoDaoTest {

    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    public void addUserInfo() {
        UserInfo userInfo = new UserInfo();

        Integer addResult = userInfoDao.addUserInfo(userInfo);
        Assert.assertTrue(Objects.equals(addResult, 1));
    }
}