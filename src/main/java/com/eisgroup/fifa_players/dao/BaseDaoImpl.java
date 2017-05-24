package com.eisgroup.fifa_players.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class BaseDaoImpl<T> implements BaseDao<T> {

    private Class<T> type;
    private SessionFactory sessionFactory;

    public void setType(Class<T> type) {
        this.type = type;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveOrUpdate(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(entity);
        tx.commit();
        session.close();
    }

    @Override
    public T get(Serializable id) {
        Session session = sessionFactory.openSession();
        T entity = (T) session.get(type, id);
        session.close();
        return entity;
    }

    @Override
    public void delete(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> list() {
        Session session = sessionFactory.openSession();
        List<T> entities = session.createQuery("from " + type.getSimpleName()).list();
        session.close();
        return entities;
    }
}