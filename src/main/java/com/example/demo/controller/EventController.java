package com.example.demo.controller;
import com.example.demo.pojo.Event;
import com.example.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;
import java.util.List;

/**
 * @author Still Walking
 */
@CrossOrigin
@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/event")
    public boolean insertEvents(@RequestBody Event event)
    {
        System.out.println(event.toString());
        return eventService.save(event);
    }
    @GetMapping("/event")
    public List<Event> getEvents(@RequestParam("date") String date)
    {
        return eventService.getEventsByDate(Date.valueOf(date));
    }
}
