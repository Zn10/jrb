package com.zn.jrb.core.service.impl;

import com.zn.jrb.core.pojo.entity.UserAccount;
import com.zn.jrb.core.mapper.UserAccountMapper;
import com.zn.jrb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author zn
 * @since 2025-01-12
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
