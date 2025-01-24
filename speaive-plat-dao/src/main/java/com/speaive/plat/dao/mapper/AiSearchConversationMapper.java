package com.speaive.plat.dao.mapper;

import com.speaive.plat.dao.module.AiSearchConversationPO;
import com.speaive.plat.dao.module.AiSearchConversationPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AiSearchConversationMapper {
    long countByExample(AiSearchConversationPOExample example);

    int deleteByExample(AiSearchConversationPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AiSearchConversationPO record);

    int insertSelective(AiSearchConversationPO record);

    AiSearchConversationPO selectOneByExample(AiSearchConversationPOExample example);

    AiSearchConversationPO selectOneByExampleSelective(@Param("example") AiSearchConversationPOExample example, @Param("selective") AiSearchConversationPO.Column ... selective);

    List<AiSearchConversationPO> selectByExampleSelective(@Param("example") AiSearchConversationPOExample example, @Param("selective") AiSearchConversationPO.Column ... selective);

    List<AiSearchConversationPO> selectByExample(AiSearchConversationPOExample example);

    AiSearchConversationPO selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") AiSearchConversationPO.Column ... selective);

    AiSearchConversationPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AiSearchConversationPO record, @Param("example") AiSearchConversationPOExample example);

    int updateByExample(@Param("record") AiSearchConversationPO record, @Param("example") AiSearchConversationPOExample example);

    int updateByPrimaryKeySelective(AiSearchConversationPO record);

    int updateByPrimaryKey(AiSearchConversationPO record);

    int batchInsert(@Param("list") List<AiSearchConversationPO> list);

    int batchInsertSelective(@Param("list") List<AiSearchConversationPO> list, @Param("selective") AiSearchConversationPO.Column ... selective);
}