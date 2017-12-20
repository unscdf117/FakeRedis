package com.unsc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by DELL on 2017/12/16.
 * 模拟Redis测试类
 * @author 犯罪嫌疑人卢某
 */
public class RedisTest {

    public static void main(String[] args) {

        RedisCache cache = new RedisCache();
        List<Object> list = new ArrayList<>();
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("Key1" , "Value1");
        map.put("Key2" , "Value2");
        list.add(map);

        cache.putValue("R1" , "12345" , 1);
        try {
            Thread.sleep(3000);
            System.out.println("获取成功 : " + cache.getValue("R1"));
        } catch (Exception e) {
            System.out.println("获取失败..");
        }
    }
}
