package com.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/user")
public class UserController {
  @RequestMapping("/{userid}")
  public String getUser(@PathVariable("userid") int userid) {
    System.out.println("User id is " + userid);
    String str=null;
    System.out.println(str.toString());
    return "index";
  }

  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  @ExceptionHandler(value = NullPointerException.class)
  public String exceptionNullHandler(Model model) {
    model.addAttribute("error", "Null Pointer Exception");
    return "error";
  }

  @ExceptionHandler({ NumberFormatException.class })
  public String numberFormatException(Model model) {
    model.addAttribute("error", "Number Format Exception");
    return "error";
  }

  @ExceptionHandler(value = Exception.class)
  public String exceptionHandler(Model model) {
    model.addAttribute("error", "Exception occured");
    return "error";
  }

}
