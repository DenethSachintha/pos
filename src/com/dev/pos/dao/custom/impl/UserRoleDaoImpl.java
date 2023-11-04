package com.dev.pos.dao.custom.impl;

import com.dev.pos.dao.custom.UserRoleDao;
import com.dev.pos.db.HibernateUtil;
import com.dev.pos.entity.UserRole;
import org.hibernate.Session;

import org.hibernate.query.Query;
import java.util.List;

public class UserRoleDaoImpl implements UserRoleDao {
    @Override
    public boolean create(UserRole userRole) {
        try(Session session = HibernateUtil.getSession()){
            session.save(userRole);
        }
        return true;
    }


    @Override
    public UserRole find(Long aLong) {
        return null;
    }

    @Override
    public boolean remove(Long aLong) {
        return false;
    }

    @Override
    public boolean modify(UserRole userRole) {
        return false;
    }

    @Override
    public List<UserRole> loadAll() {
        return null;
    }

    @Override
    public boolean isExists() {
        try(Session session= HibernateUtil.getSession()){

            Query query = session.createQuery("SELECT COUNT(*) FROM UserRole");
            Long count =(Long) query.getSingleResult();
            System.out.println(count);
            return count>0;
        }
    }
}
