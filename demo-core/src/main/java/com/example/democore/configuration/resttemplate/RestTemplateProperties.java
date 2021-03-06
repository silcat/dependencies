package com.example.democore.configuration.resttemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * restTemlate配置类
 */
@ConfigurationProperties(prefix = "rest-template")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestTemplateProperties {

    /**
     * 读取超时时间
     */
    private int readTimeut = 30000;

    /**
     * 建立连接的超时时间
     */
    private int connectTimeout = 2000;

    /**
     * 连接不够用的等待时间，不宜过长，必须设置，比如连接不够用时，等待时间过长将是灾难性的
     */
    private int connectionRequestTimeout = 1000;

    /**
     * 连接池
     */
    private int maxTotal = 500 ;

    /**
     * 单个主机的最大连接数
     */
    private int maxConnectPerRoute = 200;

    /**
     * 密码
     */
    private String userName = StringUtils.EMPTY;

    /**
     * 用户名
     */
    private String password = StringUtils.EMPTY;
}
