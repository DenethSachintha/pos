package com.dev.pos.dao.custom;


import com.dev.pos.dao.CrudDao;
import com.dev.pos.entity.UserRole;

public interface UserRoleDao extends CrudDao<UserRole,Long> {
    public boolean isExists();
}