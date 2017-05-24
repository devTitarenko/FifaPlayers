package com.eisgroup.fifa_players.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

    void saveOrUpdate(T entity);

    T get(Serializable id);

    void delete(T entity);

    List<T> list();
}