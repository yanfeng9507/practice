package cn.xiaoyanol.practice.spider.dao;

import cn.xiaoyanol.practice.spider.domain.SpiderTag;
import cn.xiaoyanol.practice.spider.domain.SpiderTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISpiderTagDAO {
    long countByExample(SpiderTagExample example);

    int deleteByExample(SpiderTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderTag record);

    int insertSelective(SpiderTag record);

    List<SpiderTag> selectByExample(SpiderTagExample example);

    SpiderTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderTag record, @Param("example") SpiderTagExample example);

    int updateByExample(@Param("record") SpiderTag record, @Param("example") SpiderTagExample example);

    int updateByPrimaryKeySelective(SpiderTag record);

    int updateByPrimaryKey(SpiderTag record);
}