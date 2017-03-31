package org.movie.dao;

import org.apache.ibatis.annotations.*;
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
     *  插入对象
     * @param movieArea
     */
    @Insert("INSERT INTO MOVIE_AREA_INFO(MOVIE_AREA_ID,MOVIE_AREA_NAME,MOVIE_AREA_STATUS) " +
            "VALUES(#{movieAreaId},#{movieAreaName},#{movieAreaStatus})")
    @Override
    public void save(MovieArea movieArea);

    /**
     *  根据id查询对象
     * @param id
     * @return
     */
    @Select("SELECT * FROM MOVIE_AREA_INFO WHERE MOVIE_AREA_ID = #{id}")
    @ResultMap("org.movie.dao.MovieAreaDao.movieAreaMap")
    @Override
    public MovieArea findById(String id);

    /**
     *  根据id删除
     * @param id
     */
    @Delete("DELETE FROM MOVIE_AREA_INFO WHERE MOVIE_AREA_ID = #{id}")
    @Override
    public void delete(String id);

    /**
     *  修改对象
     * @param movieArea
     */
    @Update("")
    @Override
    public void update(MovieArea movieArea);

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
