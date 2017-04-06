package org.movie.service.impl;

import org.movie.dao.ActorDao;
import org.movie.entity.Actor;
import org.movie.service.ActorService;
import org.movie.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @author guowei
 *         修改时间： 2017/4/1.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorDao actorDao;

    @Override
    public List<Actor> findActorList(PageBean pageBean) {
        pageBean.setRowCount(actorDao.countActor());
        return actorDao.findActorList(pageBean.getFirstResult(),pageBean.getMaxResult());
    }

    @Override
    public void save(Actor actor) {

        actor.setActorId(UUID.randomUUID().toString());
        actorDao.save(actor);
    }
}
