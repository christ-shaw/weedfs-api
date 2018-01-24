package com.wu.api;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Slf4j
public class WUWeedFactory
{
    private Map<String , VolumeClient> volumeClientMap = new ConcurrentHashMap<String,VolumeClient>();
    private ConcurrentMap<String, MasterClient> peerMasters = new ConcurrentHashMap<>();



}
