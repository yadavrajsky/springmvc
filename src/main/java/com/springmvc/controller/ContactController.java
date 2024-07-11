package com.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletFileUpload;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.core.FileItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.io.IOUtils; // Add this import statement

@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void addCommonData(Model model) {
        model.addAttribute("Header", "This is Header");
        model.addAttribute("Footer", "This is Footer");
    }

    @GetMapping("form")
    public String contactForm(Model model) {
        return "contact";
    }

    @RequestMapping(path = "/submit", method = RequestMethod.POST)
    public String saveMsg(@ModelAttribute("user") User user, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "contact";
        }
        int res = this.userService.saveUser(user);
        model.addAttribute("res", res);
        return "redirect:/contact/form";
    }

    @RequestMapping(path = "/process", method = RequestMethod.GET)
    public RedirectView process() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("form");
        return redirectView;
    }

    @RequestMapping(path = "/fileupload", method = RequestMethod.GET)
    public String fileUpload() {
        return "upload";
    }

    @RequestMapping(path = "/filesubmit", method = RequestMethod.POST)
    public String fileSubmit(HttpServletRequest request) {
        // Check that we have a file upload request
        boolean isMultipart = JakartaServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            return "redirect:/contact/fileupload?nofile";
        }
        // Create a new file upload handler
        JakartaServletFileUpload upload = new JakartaServletFileUpload();

        // Parse the request
        try {
            upload.getItemIterator(request).forEachRemaining(item -> {
                String name = item.getFieldName();
                InputStream stream = item.getInputStream();
                if (item.isFormField()) {
                    System.out.println("Form field " + name + " with value "
                            + IOUtils.toString(stream) + " detected."); // Replace Streams.asString(stream) with
                                                                        // IOUtils.toString(stream)
                } else {
                    System.out.println("File field " + name + " with file name "
                            + item.getName() + " detected.");
                    // Process the input stream

                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "redirect:/contact/fileupload?invalid";

    }
}
