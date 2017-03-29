package org.movie.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.movie.entity.Actor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/16.
 */
@Repository
public interface ActorDao extends BaseDao<Actor> {
    /**
     * 查询列表
     * @return
     */
    @Select("SELECT * FROM ACTOR_INFO")
    @ResultMap("org.movie.dao.ActorDao.actorMap")
    public List<Actor> findActorList();

    /**
     * 模糊查询
     * @param actor
     * @return
     */
    @Select("SELECT * FROM ACTOR_INFO WHERE ACTOR_NAME LIKE \"%\"#{actorName}\"%\"")
    @ResultMap("org.movie.dao.ActorDao.actorMap")
    public List<Actor> searchLikeList(Actor actor);

    /**
     * 保存对象
     * @param actor
     */
    @Insert("INSERT INTO ACTOR_INFO(ACTOR_ID,ACTOR_NAME,ACTOR_PHOTO,ACTOR_INTRO,ACTOR_BIRTHDAY,ACTOR_BIRTHPLACE,ACTOR_SEX,ACTOR_NATIONALITY,ACTOR_NATION) " +
            "VALUES(#{actorId},#{actorName},#{actorPhoto},#{actorIntro},#{actorBirthday},#{actorBirthplace},#{actorSex},#{actorNationality},#{actorNation})")
    @Override
    public void save(Actor actor);

    /**
     * 根据id查询对象
     * @param id
     * @return
     */
    @Override
    public Actor findById(String id);

    /**
     *  根据id删除对象
     * @param id
     */
    @Override
    public void delete(String id);

    /**
     *  修改对象
     * @param actor
     */
    @Override
    public void update(Actor actor);
}
