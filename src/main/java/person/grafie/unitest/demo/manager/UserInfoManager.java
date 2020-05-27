/*
 * @projectName demo
 * @package person.grafie.unitest.demo.manager
 * @className person.grafie.unitest.demo.manager.UserInfoManager
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.unitest.demo.manager;

import person.grafie.unitest.demo.domain.UserInfo;

import java.util.List;

/**
 * @author grafie www.grafie.cn
 * @version 0.0.0.1
 * @date 2020-04-14 16:55
 */
public interface UserInfoManager {
    Boolean saveUserInfo(UserInfo userInfo);

    Boolean updateUserInfo(UserInfo userInfo);

    UserInfo getUserInfoByUserId(Long userId);

    UserInfo getUserInfoByMobile(String mobile);

    List<UserInfo> listUserInfoByUserIds(List<Long> userIds);

    Boolean removeUserInfoByUserId(Long userId);
}
