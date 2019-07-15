package com.zrht.privilege.service.impl;

import com.zrht.privilege.entity.Role;
import com.zrht.privilege.dao.RoleDao;
import com.zrht.privilege.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

}
