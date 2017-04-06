package org.movie.service;

import org.movie.entity.ActorType;
import org.movie.utils.PageBean;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/16.
 */
public interface ActorTypeService {
    /**
     *  新增
     * @param actorType
     * @return
     */
    public String save(ActorType actorType);

    /**
     *  删除
     * @param actorType
     * @return
     */
    public String delete(ActorType actorType);

    /**
     *  修改
     * @param actorType
     * @return
     */
    public String update(ActorType actorType);

    /**
     *  列表
     * @return
     */
    public List<ActorType> findActorTypeList(PageBean pageBean);

    /**
     *  查询单个
     * @param actorType
     * @return
     */
    public ActorType selectActorType(ActorType actorType);

    /**
     * 批量删除
     * @param actorTypeIds
     * @return
     */
    public String deleteAll(String[] actorTypeIds);

    /**
     * 模糊查询列表
     * @param actorType
     * @return
     */
    public List<ActorType> findLikeList(ActorType actorType);

    /**
     *  统计查询
     * @return
     */
    public int countActorType();

}
