package org.movie.dao;

import org.apache.ibatis.annotations.*;
import org.movie.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/16.
 */
@Repository
public interface AdminDao extends BaseDao<Admin> {
    /**
     *  插入对象
     * @param admin
     */
    @Insert("INSERT INTO ADMIN_INFO(ADMIN_ID,ADMIN_NAME,ADMIN_PASSWORD,ADMIN_STATUS) " +
            "VALUES(#{adminId},#{adminName},#{adminPassword},#{adminStatus})")
    @Override
    public void save(Admin admin);

    /**
     *  根据id查询对象
     * @param id
     * @return
     */
    @Select("SELECT * FROM ADMIN_INFO WHERE ADMIN_ID = #{id}")
    @ResultMap("org.movie.dao.AdminDao.adminMap")
    @Override
    public Admin findById(String id);

    /**
     *  根据id删除对象
     * @param id
     */
    @Delete("DELETE FROM ADMIN_INFO WHERE ADMIN_ID = #{id}")
    @Override
    public void delete(String id);

    /**
     *  修改对象
     * @param admin
     */
    @Update("UPDATE ADMIN_INFO SET " +
            "ADMIN_NAME = #{adminName}," +
            "ADMIN_PASSWORD = #{adminPassword}," +
            "ADMIN_STATUS = #{adminStatus} " +
            "WHERE ADMIN_ID = #{adminId")
    @Override
    public void update(Admin admin);

    /**
     * 查询列表
     * @return
     */
    @Select("SELECT * FROM ADMIN_INFO")
    @ResultMap("org.movie.dao.AdminDao.adminMap")
    public List<Admin> findAdminList();
}
