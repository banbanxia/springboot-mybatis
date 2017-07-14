package com.example.demo.Dao;
import com.example.demo.Bean.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by LinyuZhang on 2017/7/14.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")

    //@Insert("insert into user values(2,'777','20','111222')")
     User findUserByName(@Param("name")String name);

}
