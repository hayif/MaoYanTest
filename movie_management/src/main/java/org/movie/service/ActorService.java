package org.movie.service;

import org.movie.entity.Actor;
import org.movie.utils.PageBean;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/4/1.
 */
public interface ActorService {

    /**
     *  查询演员列表
     * @return
     */
    public List<Actor> findActorList(PageBean pageBean);

    /**
     *  新增演员
     * @param actor
     * @return
     */
    public void save(Actor actor);
}
