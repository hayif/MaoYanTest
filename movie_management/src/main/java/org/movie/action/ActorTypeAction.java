package org.movie.action;

import org.movie.entity.ActorType;
import org.movie.service.ActorTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/28.
 */
@Controller("actorTypeAction")
@Scope("prototype")
public class ActorTypeAction {

    @Autowired
    private ActorTypeService service;

    private int countSize;
    private ActorType actorType;
    private List<ActorType> list = new ArrayList<>();

    public List<ActorType> getList() {
        return list;
    }

    public void setList(List<ActorType> list) {
        this.list = list;
    }

    public ActorType getActorType() {
        return actorType;
    }

    public void setActorType(ActorType actorType) {
        this.actorType = actorType;
    }

    public int getCountSize() {
        return countSize;
    }

    public void setCountSize(int countSize) {
        this.countSize = countSize;
    }

    public String findAllList(){
        System.out.println("11");
        list = service.findActorTypeList();
        return "success";
    }

    public String findLikeList(){
        System.out.println("1");
        list = service.findLikeList(actorType);
        return "success";
    }
    public String countActorType(){
        countSize = service.countActorType();
        return "success";
    }
}
