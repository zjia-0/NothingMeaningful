package com.accp.mapper;

import com.accp.domain.Contacts;
import com.accp.domain.ContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactsMapper {
    int countByExample(ContactsExample example);

    int deleteByExample(ContactsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contacts record);

    int insertSelective(Contacts record);

    List<Contacts> selectByExample(ContactsExample example);

    Contacts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contacts record, @Param("example") ContactsExample example);

    int updateByExample(@Param("record") Contacts record, @Param("example") ContactsExample example);

    int updateByPrimaryKeySelective(Contacts record);

    int updateByPrimaryKey(Contacts record);
}