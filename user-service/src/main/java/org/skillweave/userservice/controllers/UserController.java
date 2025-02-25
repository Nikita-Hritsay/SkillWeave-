package org.skillweave.userservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController
{

    @GetMapping("/")
    public List<Integer> getAllUsers(ModelAndView modelAndView) {
        return List.of(1);
    }


}
