package org.movie.dao;

import org.movie.entity.MovieDate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/20.
 */
@Repository
public interface MovieDateDao extends BaseDao<MovieDate> {
    /**
     * 查询列表
     * @return
     */
    public List<MovieDate> findMovieDateList();

    /**
     * 模糊查询列表
     * @param movieDate
     * @return
     */
    public List<MovieDate> findLikeList(MovieDate movieDate);
}
