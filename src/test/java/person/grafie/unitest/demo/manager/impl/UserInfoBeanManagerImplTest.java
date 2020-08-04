/*
 * @projectName demo
 * @package person.grafie.unitest.demo.manager.impl
 * @className person.grafie.unitest.demo.manager.impl.UserInfoBeanManagerImplTest
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.unitest.demo.manager.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import person.grafie.unitest.demo.bean.UserInfoBean;
import person.grafie.unitest.demo.dao.UserInfoDao;
import person.grafie.unitest.demo.domain.UserInfo;
import person.grafie.unitest.demo.manager.UserInfoManager;
import static org.mockito.Mockito.*;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;

/**
 * @author grafie www.grafie.cn
 * @version 0.0.0.1
 * @date 2020-04-14 16:50
 */
@RunWith(MockitoJUnitRunner.class)
public class UserInfoBeanManagerImplTest {
    @Mock
    private UserInfoDao userInfoDao;

    @InjectMocks
    private UserInfoManager userInfoManager = new UserInfoManagerImpl();
    private UserInfo userInfoToSave;

    @Before
    public void setUp() throws Exception {
        //用于初始化@Mock注解修饰的组件
        MockitoAnnotations.initMocks(this);
        userInfoToSave = new UserInfo();
        userInfoToSave.setMobile("18978760099");
        userInfoToSave.setUserId(7777L);
        userInfoToSave.setSex(1);
    }

    @Test
    public void saveUserInfo_case1() throws Exception {
        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        when(httpServletRequest.getParameter("hello")).thenReturn("world");
        System.out.println(httpServletRequest.getParameter("hello"));
        //step1 准备数据和动作
        doReturn(1).when(userInfoDao).saveUserInfoBean(any(UserInfoBean.class));

        //step2 运行待测试模块
        Boolean res = userInfoManager.saveUserInfo(userInfoToSave);

        //step3 验证测试结果
        assertTrue(res);
    }

    @Test
    public void saveUserInfo_case2() throws Exception {
        //step1 准备数据和动作
        doReturn(0).when(userInfoDao).saveUserInfoBean(any(UserInfoBean.class));

        //step2 运行待测试模块
        Boolean res = userInfoManager.saveUserInfo(userInfoToSave);

        //step3 验证测试结果
        assertFalse(res);
    }

    @Test
    public void updateUserInfo() throws Exception {
    }

    @Test
    public void getUserInfoByUserId() throws Exception {
    }

    @Test
    public void getUserInfoByMobile() throws Exception {
    }

    @Test
    public void listUserInfoByUserIds() throws Exception {
    }

    @Test
    public void removeUserInfoByUserId() throws Exception {
    }

}
