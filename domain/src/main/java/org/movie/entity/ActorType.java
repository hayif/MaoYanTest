package org.movie.entity;

/**
 * Created by guowei on 2017/2/26.
 * actor_type_info 演员类型表
 */
public class ActorType {
    //演员类型id
    private String actorTypeId;
    //演员类型名称
    private String actorTypeName;
    //演员类型状态（0启用1未启用）
    private int actorTypeStatus;


    public String getActorTypeId() {
        return actorTypeId;
    }

    public void setActorTypeId(String actorTypeId) {
        this.actorTypeId = actorTypeId;
    }

    public String getActorTypeName() {
        return actorTypeName;
    }

    public void setActorTypeName(String actorTypeName) {
        this.actorTypeName = actorTypeName;
    }

    public int getActorTypeStatus() {
        return actorTypeStatus;
    }

    public void setActorTypeStatus(int actorTypeStatus) {
        this.actorTypeStatus = actorTypeStatus;
    }
}
