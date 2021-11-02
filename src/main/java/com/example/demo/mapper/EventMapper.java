package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.Event;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Still Walking
 */
@Mapper
public interface EventMapper extends BaseMapper<Event> {
}
