package com.inc.emrys.rojaya.configuration;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {

    ConfigurationCustomizer myBatisConfiguratonCustomizer()
    {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {

            }
        };
    }

}
