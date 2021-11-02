package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.EventMapper;
import com.example.demo.pojo.Event;
import com.example.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Still Walking
 */
@Service
public class EventServiceImpl extends ServiceImpl<EventMapper, Event> implements EventService {
    @Autowired
    private EventMapper eventMapper;

    @Override
    public List<Event> getEventsByDate(java.sql.Date date) {
        QueryWrapper<Event> wrapper=new QueryWrapper<>();
        wrapper.eq("date",date);
        return eventMapper.selectList(wrapper);
    }
}
