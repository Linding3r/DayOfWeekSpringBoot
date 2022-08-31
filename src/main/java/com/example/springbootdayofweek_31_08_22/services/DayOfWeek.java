package com.example.springbootdayofweek_31_08_22.services;

import java.time.LocalDateTime;

public class DayOfWeek {
  LocalDateTime day;

  public DayOfWeek(){
    day = LocalDateTime.now();
  }

  public String DateToString(){
    String dayOfWeek = "";
    switch(day.getDayOfWeek()){
      case MONDAY -> dayOfWeek = "Monday";
      case TUESDAY -> dayOfWeek = "Tuesday";
      case WEDNESDAY -> dayOfWeek = "Wednesday";
      case THURSDAY -> dayOfWeek = "Thursday";
      case FRIDAY ->  dayOfWeek = "Friday";
      case SATURDAY -> dayOfWeek = "Saturday";
      case SUNDAY -> dayOfWeek = "Sunday";
    } return dayOfWeek;
  }
}
