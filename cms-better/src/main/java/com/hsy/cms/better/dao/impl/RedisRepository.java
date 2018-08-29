package com.hsy.cms.better.dao.impl;

import com.hsy.cms.better.dao.IRedisRepository;
import com.hsy.java.enums.CacheEnum;
import com.hsy.java.exception.cache.CacheException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path base-service/com.hsy.base.service.redis.dao
 * @date 2017/12/26 14:41
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Repository
public class RedisRepository implements IRedisRepository {
    private final Logger logger = LoggerFactory.getLogger(this.getClass()) ;
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    private ValueOperations<String,Object> valueOperations;
    private ListOperations<String,Object> listOperations;
    private HashOperations hashOperations;

    @PostConstruct
    public void getValueOperation(){
        logger.info("正在初始化valueOperations，listOperations，hashOperations");
        valueOperations = redisTemplate.opsForValue();
        listOperations = redisTemplate.opsForList();
        hashOperations = redisTemplate.opsForHash();
    }

    public boolean setString(String k,Object obj){
        try{
            valueOperations.set(k,obj);
            return true ;
        }catch(Exception e){
            throw new CacheException(CacheEnum.CACHE_HANDLE_SET_EXCEPTION) ;
        }
    }

    public <T> boolean setStringWithExpire(String k,T obj,long expire){
        try{
            valueOperations.set(k,obj,expire);
            return true ;
        }catch(Exception e){
            throw new CacheException(CacheEnum.CACHE_HANDLE_SET_EXCEPTION) ;
        }
    }

    public <T> boolean setStringWithExpireAndTimeUnit(String k, T v, long expire, TimeUnit timeUnit){
        try{
            valueOperations.set(k,v,expire,timeUnit);
            return true ;
        }catch(Exception e){
            throw new CacheException(CacheEnum.CACHE_HANDLE_SET_EXCEPTION) ;
        }
    }

    public <T> T getStringValue(String k){
        try{
            return (T) valueOperations.get(k) ;
        }catch(Exception e){
            throw new CacheException(CacheEnum.CACHE_HANDLE_GET_EXCEPTION) ;
        }
    }

    public <T> Long setList(String key,T obj){
        try {
            return listOperations.leftPush(key,obj);
        } catch (Exception e) {
            throw new CacheException(CacheEnum.CACHE_HANDLE_SET_EXCEPTION) ;
        }
    }

    public <T> T getList(String key){
        try {
            return (T) listOperations.leftPop(key) ;
        } catch (Exception e) {
            throw new CacheException(CacheEnum.CACHE_HANDLE_GET_EXCEPTION) ;
        }
    }

    public String updateString(String k,String v){
        try{
            return (String) valueOperations.getAndSet(k,v) ;
        }catch(Exception e){
            throw new CacheException(CacheEnum.CACHE_HANDLE_SET_EXCEPTION) ;
        }
    }

    public boolean delete(String k){
        try{
            if(exists(k)){
                redisTemplate.delete(k);
            }
            return true ;
        }catch(Exception e){
            throw new CacheException(CacheEnum.CACHE_HANDLE_DELETE_EXCEPTION) ;
        }
    }
    /**
     * 判断缓存中是否有对应的value
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    @Override
    public Long incr(String key) {
        return valueOperations.increment(key, 1L);
        // return redisTemplate.getConnectionFactory().getConnection().incr(key.getBytes()) ;
    }

    @Override
    public Long incr(String key, Long count) {
        // return redisTemplate.getConnectionFactory().getConnection().incrBy(key.getBytes(), count) ;
        return valueOperations.increment(key, count) ;
    }
}
