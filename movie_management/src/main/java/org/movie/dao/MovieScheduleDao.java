package org.movie.dao;

import org.movie.entity.MovieSchedule;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/20.
 */
@Repository
public interface MovieScheduleDao extends BaseDao<MovieSchedule> {
    /**
     * 查询列表
     * @return
     */
    public List<MovieSchedule> findMovieScheduleList();
}
