package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * @author Still Walking
 */
@Data
@TableName(value = "base.event")
public class Event {
    /**
     * 主键
     */
    @TableId("id")
    private int id;
    /**
     * 日期
     */
    @TableField("date")
    private Date date;
    /**
     * 事件类型
     */
    @TableField("event_type")
    private String eventType;
    /**
     * 时间段
     */
    @TableField("period")
    private String period;
    /**
     * 持续时长
     */
    @TableField("duration")
    private float duration;
    /**
     * 事件描述
     */
    @TableField("description")
    private String description;
    /**
     * 事件重要性
     */
    @TableField("importance")
    private int importance;
}
