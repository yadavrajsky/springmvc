package com.springmvc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
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
