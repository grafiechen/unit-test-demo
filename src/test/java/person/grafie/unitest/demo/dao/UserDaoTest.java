/*
 * @projectName demo
 * @package person.grafie.unitest.demo.dao
 * @className person.grafie.unitest.demo.dao.UserDaoTest
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.unitest.demo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import person.grafie.unitest.demo.bean.UserInfoBean;

import javax.annotation.Resource;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author grafie www.grafie.cn
 * @version 0.0.0.1
 * @date 2020-04-14 16:50
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-h2-applicationContext.xml")
public class UserDaoTest {
    @Resource
    private UserInfoDao userInfoDAO;

    @Test
    public void saveUserInfoBean() throws Exception {
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.setUserId(1003L);
        userInfoBean.setNickname("lisi");
        userInfoBean.setMobile("13245678911");
        userInfoBean.setSex(1);
        userInfoBean.setUpdateTime(new Date());
        userInfoBean.setCreateTime(new Date());

        int rows = userInfoDAO.saveUserInfoBean(userInfoBean);

        assertEquals(1, rows);
    }

    @Test
    public void updateUserInfoBean() throws Exception {
    }

    @Test
    public void getUserInfoBeanByUserId() throws Exception {
    }

    @Test
    public void getUserInfoBeanByMobile() throws Exception {
    }

    @Test
    public void listUserInfoBeanByUserIds() throws Exception {
    }

    @Test
    public void removeUserInfoBeanByUserId() throws Exception {
    }

}
