package com.ochiamalu.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ochiamalu.usercenter.model.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 Mapper
 *
 * @author OchiaMalu
 * @date 2023/07/29
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

