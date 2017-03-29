package org.movie.dao;

import org.movie.entity.MovieArea;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 * 修改时间： 2017/3/15.
 */
@Repository
public interface MovieAreaDao extends BaseDao<MovieArea> {
    /**
     * 查找整个MovieArea、list集合保存
     * @return
     */
    public List<MovieArea> findMovieAreaList();

    /**
     * 模糊查询列表
     * @param movieArea
     * @return
     */
    public List<MovieArea> findLikeList(MovieArea movieArea);
}
