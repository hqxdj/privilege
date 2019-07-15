package com.zrht.privilege.service.impl;

import com.zrht.privilege.entity.UserGroupRole;
import com.zrht.privilege.dao.UserGroupRoleDao;
import com.zrht.privilege.service.UserGroupRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户组_角色关联表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class UserGroupRoleServiceImpl extends ServiceImpl<UserGroupRoleDao, UserGroupRole> implements UserGroupRoleService {

}
