package com.changyingjie.dao;

import com.changyingjie.domain.Topic;

import java.util.List;

public interface TopicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectById(Integer id);

    List<Topic> listTopicsAndUsers();

    List<Topic> listTopicsAndUsersOfTab(Integer tabId);

    List<Topic>  listMostCommentsTopics();

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKeyWithBLOBs(Topic record);

    int updateByPrimaryKey(Topic record);

    List<Topic> getAllTopics();

    int clickAddOne(Integer id);

    //获取主题总数
    int getTopicsNum();
    //获取该板块的话题数
    int getTabTopicsNum(Integer tabId);
}