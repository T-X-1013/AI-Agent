package com.tao.taoaiagent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class LangChainAiInvoke {

    // 初始化方法，用于设置UTF-8编码
//    private static void initOutputEncoding() {
//        try {
//            // 强制设置标准输出流为UTF-8
//            System.setOut(new PrintStream(System.out, true, "UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException("Failed to set UTF-8 encoding for System.out", e);
//        }
//    }

    public static void main(String[] args) {
        // 初始化编码设置
//        initOutputEncoding();

        ChatLanguageModel qwenModel = QwenChatModel.builder()
                .apiKey(TestApiKey.API_KEY)
                .modelName("qwen-plus")
                .build();
        String answer = qwenModel.chat("我是哈商大的王！十一公寓唯一的King！！！");
        System.out.println(answer);
    }
}


