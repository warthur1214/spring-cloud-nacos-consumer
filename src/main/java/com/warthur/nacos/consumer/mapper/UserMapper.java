package com.warthur.nacos.consumer.mapper;


import java.util.List;

/**
 * @author warthur
 * @date 2021/05/15
 */
public interface UserMapper {

    List<String> getUsers(String name);
}
