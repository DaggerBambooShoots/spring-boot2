package com.example.springboot.web.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springboot.mapper.StudentMapper;
import com.example.springboot.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 35000)
public class StudentServiceImpl implements StudentService {

    /*@Autowired
    StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;*/

    @Override
    public Integer queryAllStudentCount() {
        return 123;
        /*//设置 redisTemplate 对象 key 的序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //从 redis 缓存中获取总人数
        Integer allStudentCount = (Integer)
                redisTemplate.opsForValue().get("allStudentCount");
        *//*if (allStudentCount==null){
            //去数据库查询，并存放到 redis 缓存中
            allStudentCount = studentMapper.selectAllStudentCount();

            redisTemplate.opsForValue().set("allStudentCount",allStudentCount,60,
                    TimeUnit.SECONDS);
            System.out.println("oracle");
        }else {
            System.out.println("redis");
        }*//*
        //以上代码在多线程高并发的时候，会出现一种现象，叫缓存穿透
//        通过双重检测+同步代码块来解决
        if (allStudentCount==null){
            //设置同步代码块
            synchronized (this){
                //再次从redis查询人数
                allStudentCount = (Integer)
                        redisTemplate.opsForValue().get("allStudentCount");
                if (allStudentCount==null){
                    //去数据库查询，并存放到 redis 缓存中
                    allStudentCount = studentMapper.selectAllStudentCount();

                    redisTemplate.opsForValue().set("allStudentCount",allStudentCount,60,
                            TimeUnit.SECONDS);
                    System.out.println("oracle");
                }else {
                    System.out.println("redis");
                }
            }
        }else {
            System.out.println("redis");
        }


        return allStudentCount;*/
    }

    @Override
    public String test() {
        return "test";
    }
}
