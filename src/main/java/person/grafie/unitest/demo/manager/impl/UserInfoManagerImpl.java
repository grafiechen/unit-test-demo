/*
 * @projectName demo
 * @package person.grafie.unitest.demo.manager.impl
 * @className person.grafie.unitest.demo.manager.impl.UserInfoManagerImpl
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.unitest.demo.manager.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import person.grafie.unitest.demo.bean.UserInfoBean;
import person.grafie.unitest.demo.dao.UserInfoDao;
import person.grafie.unitest.demo.domain.UserInfo;
import person.grafie.unitest.demo.manager.UserInfoManager;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author grafie www.grafie.cn
 * @version 0.0.0.1
 * @date 2020-04-14 16:55
 */
@Component
@Slf4j
public class UserInfoManagerImpl implements UserInfoManager {
    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public Boolean saveUserInfo(UserInfo userInfo) {
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.setUserId(userInfo.getUserId());
        userInfoBean.setMobile(userInfo.getMobile());
        userInfoBean.setNickname(userInfo.getNickname());
        userInfoBean.setSex(userInfo.getSex());
        userInfoBean.setUpdateTime(new Date());
        userInfoBean.setCreateTime(new Date());

        int rows = userInfoDao.saveUserInfoBean(userInfoBean);
        if (rows != 1) {
            log.error("save userInfo to db failed. userInfoBean:{}, rows:{}", userInfoBean, rows);
            return false;
        }
        return true;
    }

    @Override
    public Boolean updateUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByUserId(Long userId) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByMobile(String mobile) {
        return null;
    }

    @Override
    public List<UserInfo> listUserInfoByUserIds(List<Long> userIds) {
        return null;
    }

    @Override
    public Boolean removeUserInfoByUserId(Long userId) {
        return null;
    }
}
