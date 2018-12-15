package com.andrushenko.dao.impl;

import com.andrushenko.dao.UserDao;
import com.andrushenko.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class UserDaoImpl implements UserDao {
    @Inject
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

    @Override
    public User getByEmailPassword(String email, String password) {
        Query<User> query = getSession().createQuery("from User where email= :email and password= :password", User.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        return query.getResultList().stream().findAny().orElse(null);
    }

    @Override
    public User getByEmail(String email) {
        Query<User> query = getSession().createQuery("from User where email= :email", User.class);
        query.setParameter("email", email);
        return query.getResultList().stream().findAny().orElse(null);
    }
}
