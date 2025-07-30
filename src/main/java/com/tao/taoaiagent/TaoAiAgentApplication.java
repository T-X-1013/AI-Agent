package com.tao.taoaiagent;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        // 为了便于大家开发调试和部署，取消数据库自动配置
        // 需要使用 PgVector 时把 DataSourceAutoConfiguration.class 删除
        DataSourceAutoConfiguration.class,
        org.springframework.ai.mcp.client.autoconfigure.McpClientAutoConfiguration.class
})
public class TaoAiAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaoAiAgentApplication.class, args);
    }

}



