package com.zn.jrb.core.service.impl;

import com.zn.jrb.core.pojo.entity.UserInfo;
import com.zn.jrb.core.mapper.UserInfoMapper;
import com.zn.jrb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author zn
 * @since 2025-01-12
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
