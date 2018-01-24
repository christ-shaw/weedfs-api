package com.wu.api.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(WeedsConfig.class)
public class UrlBuilder
{

    @Autowired
    WeedsConfig weedsConfig;

    private String assembleUrl() {
        return String.format("%s:%d", weedsConfig.getHost(), weedsConfig.getPort());
    }
}
