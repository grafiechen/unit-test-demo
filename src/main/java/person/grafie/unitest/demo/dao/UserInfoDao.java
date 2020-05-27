/*
 * @projectName demo
 * @package person.grafie.unitest.demo.dao
 * @className person.grafie.unitest.demo.dao.UserInfoDao
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.unitest.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import person.grafie.unitest.demo.bean.UserInfoBean;

import java.util.List;

/**
 * @author grafie www.grafie.cn
 * @version 0.0.0.1
 * @date 2020-04-14 16:45
 */
@Repository
public interface UserInfoDao {

    int saveUserInfoBean(UserInfoBean userInfoBean);

    int updateUserInfoBean(UserInfoBean userInfoBean);

    UserInfoBean getUserInfoBeanByUserId(@Param("userId") Long userId);

    UserInfoBean getUserInfoBeanByMobile(@Param("mobile") String mobile);

    List<UserInfoBean> listUserInfoBeanByUserIds(@Param("userIds") List<Long> userIds);

    int removeUserInfoBeanByUserId(@Param("userId") Long userId);
}
