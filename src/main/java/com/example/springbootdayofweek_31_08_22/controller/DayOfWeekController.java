package com.example.springbootdayofweek_31_08_22.controller;

import com.example.springbootdayofweek_31_08_22.services.DayOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayOfWeekController {

  @GetMapping("/dayOfWeek")
  public String dayOfWeek(){
    DayOfWeek day = new DayOfWeek();
    return day.DateToString();
  }
}
