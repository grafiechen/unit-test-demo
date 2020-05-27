/*
 * @projectName demo
 * @package person.grafie.unitest.demo.domain
 * @className person.grafie.unitest.demo.domain.UserInfo
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.unitest.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author grafie www.grafie.cn
 * @version 0.0.0.1
 * @date 2020-04-14 16:59
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserInfo {
    private Long userId;
    private String nickname;
    private String mobile;
    private Integer sex;
}
