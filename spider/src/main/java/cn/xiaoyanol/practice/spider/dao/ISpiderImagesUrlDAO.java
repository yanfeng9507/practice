package cn.xiaoyanol.practice.spider.dao;

import cn.xiaoyanol.practice.spider.domain.SpiderImagesUrl;
import cn.xiaoyanol.practice.spider.domain.SpiderImagesUrlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISpiderImagesUrlDAO {
    long countByExample(SpiderImagesUrlExample example);

    int deleteByExample(SpiderImagesUrlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpiderImagesUrl record);

    int insertSelective(SpiderImagesUrl record);

    List<SpiderImagesUrl> selectByExample(SpiderImagesUrlExample example);

    SpiderImagesUrl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpiderImagesUrl record, @Param("example") SpiderImagesUrlExample example);

    int updateByExample(@Param("record") SpiderImagesUrl record, @Param("example") SpiderImagesUrlExample example);

    int updateByPrimaryKeySelective(SpiderImagesUrl record);

    int updateByPrimaryKey(SpiderImagesUrl record);
}