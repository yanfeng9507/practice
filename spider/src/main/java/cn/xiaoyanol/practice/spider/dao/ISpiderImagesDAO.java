package cn.xiaoyanol.practice.spider.dao;

import cn.xiaoyanol.practice.spider.domain.SpiderImages;
import cn.xiaoyanol.practice.spider.domain.SpiderImagesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISpiderImagesDAO {
    long countByExample(SpiderImagesExample example);

    int deleteByExample(SpiderImagesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderImages record);

    int insertSelective(SpiderImages record);

    List<SpiderImages> selectByExample(SpiderImagesExample example);

    SpiderImages selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderImages record, @Param("example") SpiderImagesExample example);

    int updateByExample(@Param("record") SpiderImages record, @Param("example") SpiderImagesExample example);

    int updateByPrimaryKeySelective(SpiderImages record);

    int updateByPrimaryKey(SpiderImages record);
}