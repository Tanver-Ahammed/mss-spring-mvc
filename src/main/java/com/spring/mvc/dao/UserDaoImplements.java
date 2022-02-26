package com.spring.mvc.dao;

import com.spring.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImplements implements UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    @Override
    public int saveUser(User user) {
        int affectedRow = 0;
        affectedRow = (Integer) this.getHibernateTemplate().save(user);
        return affectedRow;
    }

}
