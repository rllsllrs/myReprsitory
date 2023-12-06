package com.dao;

import com.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {

    @Select("select * from tb_book where id = ${id}")
    Book getById(Integer id);

    @Update("update tb_book set type=${type} ,name=${name},description=#{description}")
    public int update(Book book);

    @Delete("delete from tb_book where id = #{id}")
    public int delete(Integer id);

    @Insert("insert into tb_book (id,name,type,description) values(${id},${name},${type},${description})")
    public int save(Book book);

    @Select("select * from tb_book")
    public List<Book> getAll();
}
