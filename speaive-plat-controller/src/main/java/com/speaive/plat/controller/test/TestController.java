package com.speaive.plat.controller.test;

import com.speaive.plat.dao.mapper.AiSearchConversationMapper;
import com.speaive.plat.dao.module.AiSearchConversationPO;
import com.speaive.plat.dao.module.AiSearchConversationPOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xuhongzhuo
 * @description
 * @create 2025/1/24 14:58
 */
@RestController
public class TestController {

    @Autowired
    private AiSearchConversationMapper aiSearchConversationMapper;

    @GetMapping("/test")
    public List<AiSearchConversationPO> getConversationList() {
        AiSearchConversationPOExample aiSearchConversationPOExample = new AiSearchConversationPOExample();
        aiSearchConversationPOExample.createCriteria().andDeletedEqualTo(0);
        return aiSearchConversationMapper.selectByExample(aiSearchConversationPOExample);
    }
}
