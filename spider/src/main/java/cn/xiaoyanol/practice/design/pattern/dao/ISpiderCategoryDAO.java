package cn.xiaoyanol.practice.design.pattern.dao;

import cn.xiaoyanol.practice.design.pattern.domain.SpiderCategory;
import cn.xiaoyanol.practice.design.pattern.domain.SpiderCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISpiderCategoryDAO {
    long countByExample(SpiderCategoryExample example);

    int deleteByExample(SpiderCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderCategory record);

    int insertSelective(SpiderCategory record);

    List<SpiderCategory> selectByExample(SpiderCategoryExample example);

    SpiderCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderCategory record, @Param("example") SpiderCategoryExample example);

    int updateByExample(@Param("record") SpiderCategory record, @Param("example") SpiderCategoryExample example);

    int updateByPrimaryKeySelective(SpiderCategory record);

    int updateByPrimaryKey(SpiderCategory record);
}