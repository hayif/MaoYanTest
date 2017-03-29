package org.movie.dao;

import org.movie.entity.MoviePhotos;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/20.
 */
@Repository
public interface MoviePhotosDao extends BaseDao<MoviePhotos> {
    /**
     * 查询列表
     * @return
     */
    public List<MoviePhotos> findMoviePhotosList();
}
