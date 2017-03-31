package org.movie.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.movie.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guowei
 *         修改时间： 2017/3/16.
 */
@Repository
public interface UserDao extends BaseDao<User> {
    /**
     *  插入对象
     * @param user
     */
    @Insert("INSERT INTO USER_INFO(USER_ID,USER_NAME,USER_PHONE,USER_PASSWORD,USER_HEAD_PORTRAIT,USER_STATUS) " +
            "VALUES(#{userId},#{userName},#{userPhone},#{userPassword},#{userHeadPortrait},#{userStatus})")
    @Override
    public void save(User user);

    /**
     *  根据id查询对象
     * @param id
     * @return
     */
    @Select("SELECT * FROM USER_INFO WHERE USER_ID = #{id}")
    @ResultMap("org.movie.dao.UserDao.userMap")
    @Override
    public User findById(String id);

    /**
     *  根据id删除对象
     * @param id
     */
    @Select("DELETE FROM USER_INFO WHERE USER_ID = #{id}")
    @Override
    public void delete(String id);

    /**
     *  修改对象
     * @param user
     */
    @Update("UPDATE USER_INFO SET " +
            "USER_NAME = #{userName}," +
            "USER_PHONE = #{userPhone}," +
            "USER_PASSWORD = #{userPassword}," +
            "USER_HEAD_PORTRAIT = #{userHeadPortrait} " +
            "WHERE USER_ID = #{userId}")
    @Override
    public void update(User user);

    /**
     *   查询列表
     * @return
     */
    @Select("SELECT * FROM USER_INFO")
    @ResultMap("org.movie.dao.UserDao.userMap")
    public List<User> findUserList();
}
