package com.andrushenko.controller;

import com.andrushenko.model.User;
import com.andrushenko.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AuthController {
    @Inject
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/loginForm")
    public String loginForm() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/loginForm/login")
    public String login(@ModelAttribute User loginUserFrom, ModelMap modelMap, HttpServletRequest request) {
        User user = userService.getByEmailPassword(loginUserFrom.getEmail(), loginUserFrom.getPassword());
        request.getSession().setAttribute("user", user);
        modelMap.addAttribute("user", user);
        return user != null ? "redirect:/" : "/loginForm";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/logOut")
    public String logOut(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return "redirect:/";
    }
}
