/*
 * @projectName demo
 * @package person.grafie.unitest.demo.bean
 * @className person.grafie.unitest.demo.bean.UserInfoBean
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.unitest.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author grafie www.grafie.cn
 * @version 0.0.0.1
 * @date 2020-04-14 16:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoBean {
    private Long id;
    private Long userId;
    private String nickname;
    private String mobile;
    private Integer sex;
    private Date updateTime;
    private Date createTime;
}
