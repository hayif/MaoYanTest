package org.movie.dao;

import org.movie.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/20.
 */
@Repository
public interface MovieDao extends BaseDao<Movie> {
    /**
     * 查询列表
     * @return
     */
    public List<Movie> findMovieList();
}
