package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.Event;

import java.sql.Date;
import java.util.List;

/**
 * @author Still Walking
 */
public interface EventService extends IService<Event> {
    /**
     * 通过日期查询事件列表
     * @param date 查询日期
     * @return 事件列表
     */
    List<Event> getEventsByDate(Date date);
}
