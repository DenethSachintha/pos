package com.dev.pos.dao.custom.impl;

import com.dev.pos.dao.custom.UserDao;
import com.dev.pos.db.HibernateUtil;
import com.dev.pos.entity.User;
import org.hibernate.Session;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean create(User user) {
        try(Session session= HibernateUtil.getSession()){
            session.save(user);
            session.close();
        }
        return true;
    }

    @Override
    public User find(Integer integer) {
        return null;
    }

    @Override
    public boolean remove(Integer integer) {
        return false;
    }

    @Override
    public boolean modify(User user) {
        return false;
    }

    @Override
    public List<User> loadAll() {
        return null;
    }
}
