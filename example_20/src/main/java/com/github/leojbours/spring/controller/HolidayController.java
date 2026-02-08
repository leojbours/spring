package com.github.leojbours.spring.controller;

import com.github.leojbours.spring.model.Holiday;
import java.util.Arrays;
import java.util.List;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolidayController {

  @GetMapping("/holidays")
  public String getHolidaysPageQueryParams(
      @RequestParam(required = false) boolean festival,
      @RequestParam(required = false) boolean federal,
      Model model
  ) {
    model.addAttribute("festival", festival);
    model.addAttribute("federal", federal);

    populateModel(model);

    return "holidays.html";
  }

  @GetMapping("/holidays/{display}")
  public String getHolidaysPagePathVariables(
      @PathVariable String display,
      Model model
  ) {

    if (display != null) {
      boolean displayAll = display.equals("all");
      model.addAttribute("festival", displayAll || display.equals("festival"));
      model.addAttribute("federal", displayAll || display.equals("federal"));
    }

    populateModel(model);

    return "holidays.html";
  }

  private void populateModel(Model model) {
    List<Holiday> holidays = Arrays.asList(
        new Holiday(" Jan 1 ","New Year's Day", Holiday.Type.FESTIVAL),
        new Holiday(" Oct 31 ","Halloween", Holiday.Type.FESTIVAL),
        new Holiday(" Nov 24 ","Thanksgiving Day", Holiday.Type.FESTIVAL),
        new Holiday(" Dec 25 ","Christmas", Holiday.Type.FESTIVAL),
        new Holiday(" Jan 17 ","Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
        new Holiday(" July 4 ","Independence Day", Holiday.Type.FEDERAL),
        new Holiday(" Sep 5 ","Labor Day", Holiday.Type.FEDERAL),
        new Holiday(" Nov 11 ","Veterans Day", Holiday.Type.FEDERAL)
    );
    Holiday.Type[] types = Holiday.Type.values();
    for (Holiday.Type type : types) {
      model.addAttribute(type.toString(), holidays.stream().filter(holiday -> holiday.getType().equals(type)).toList());
    }
  }
}
