package org.movie.dao;

import org.apache.ibatis.annotations.*;
import org.movie.entity.ActorType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/16.
 */
@Repository
public interface ActorTypeDao extends BaseDao<ActorType> {
    /**
     * 查询列表
     * @return
     */
    @Select("SELECT * FROM ACTOR_TYPE_INFO")
    @ResultMap("org.movie.dao.ActorTypeDao.actorTypeMap")
    public List<ActorType> findActorTypeList();

    /**
     * 模糊查询
     * @param
     * @return
     */
    @Select("SELECT * FROM ACTOR_TYPE_INFO WHERE ACTOR_TYPE_NAME LIKE \"%\"#{actorTypeName}\"%\" ")
    @ResultMap("org.movie.dao.ActorTypeDao.actorTypeMap")
    public List<ActorType> findLikeList(String actorTypeName);

    /**
     *  保存对象
     * @param actorType
     */
    @Insert("INSERT INTO ACTOR_TYPE_INFO(ACTOR_TYPE_ID,ACTOR_TYPE_NAME,ACTOR_TYPE_STATUS) " +
            "VALUES(#{actorTypeId},#{actorTypeName},#{actorTypeStatus})")
    @Override
    public void save(ActorType actorType);

    /**
     *  根据id查找对象
     * @param id
     * @return
     */
    @Select("SELECT * FROM ACTOR_TYPE_INFO WHERE ACTOR_TYPE_ID = #{id}")
    @ResultMap("org.movie.dao.ActorTypeDao.actorTypeMap")
    @Override
    public ActorType findById(String id);

    /**
     *  根据id删除对象
     * @param id
     */
    @Delete("DELETE FROM ACTOR_TYPE_INFO WHERE ACTOR_TYPE_ID = #{id}")
    @Override
    public void delete(String id);

    /**
     *  修改对象
     * @param actorType
     */
    @Update("UPDATE ACTOR_TYPE_INFO SET ACTOR_TYPE_NAME = #{actorTypeName},ACTOR_TYPE_STATUS = #{actorTypeStatus} WHERE ACTOR_TYPE_ID = #{actorTypeId}")
    @Override
    public void update(ActorType actorType);
}
