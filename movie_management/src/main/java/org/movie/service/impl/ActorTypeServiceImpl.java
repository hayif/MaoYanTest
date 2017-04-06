package org.movie.service.impl;

import org.movie.dao.ActorTypeDao;
import org.movie.entity.ActorType;
import org.movie.service.ActorTypeService;
import org.movie.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @author guowei
 *         修改时间： 2017/3/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ActorTypeServiceImpl implements ActorTypeService {
    @Autowired
    private ActorTypeDao actorTypeDao;

    @Override
    public String save(ActorType actorType) {
        String message = "增加成功";
        try {
            actorType.setActorTypeId(UUID.randomUUID().toString());
            actorTypeDao.save(actorType);
        }catch (RuntimeException e){
            e.printStackTrace();
            message = "删除失败";
            throw e;
        }
        return message;
    }

    @Override
    public String delete(ActorType actorType) {
        String message = "删除成功";
        try {
            actorTypeDao.delete(actorType.getActorTypeId());
        }catch (RuntimeException e){
            e.printStackTrace();
            message = "删除失败";
            throw e;
        }
        return message;
    }

    @Override
    public String update(ActorType actorType) {
        String message = "修改成功";
        try {
            actorTypeDao.update(actorType);
        }catch (RuntimeException e){
            e.printStackTrace();
            message = "修改失败";
            throw e;
        }
        return message;
    }

    @Override
    public List<ActorType> findActorTypeList(PageBean pageBean) {
        pageBean.setRowCount(actorTypeDao.countActorType());
        return actorTypeDao.findActorTypeList(pageBean.getFirstResult(),pageBean.getMaxResult());
    }

    @Override
    public ActorType selectActorType(ActorType actorType) {
        return actorTypeDao.findById(actorType.getActorTypeId());
    }

    @Override
    public String deleteAll(String[] actorTypeIds) {
        String message = "删除成功";
        try {
            for(String actorTypeId :actorTypeIds){
                actorTypeDao.delete(actorTypeId);
            }
        }catch (RuntimeException e){
            e.printStackTrace();
            message = "删除失败";
            throw e;
        }
        return message;
    }

    @Override
    public List<ActorType> findLikeList(ActorType actorType) {
        return actorTypeDao.findLikeList(actorType.getActorTypeName());
    }

    @Override
    public int countActorType() {
        return actorTypeDao.countActorType();
    }
}
