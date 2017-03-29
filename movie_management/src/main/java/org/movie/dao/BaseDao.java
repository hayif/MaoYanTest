package org.movie.dao;

import java.io.Serializable;

/**
 * Created by guowei on 2017/2/27.
 * @author guowei
 *  通用的Dao方法
 */
public interface BaseDao<T> {
    /**
     *  保存对象
     * @param t
     */
    public void save(T t);

    /**
     *  根据id查找对象
     * @param id
     * @return
     */
    public T findById(String id);

    /**
     *  根据id删除对象
     * @param t
     */
    public void delete(String id);

    /**
     *  修改对象
     * @param t
     */
    public void update(T t);
}
