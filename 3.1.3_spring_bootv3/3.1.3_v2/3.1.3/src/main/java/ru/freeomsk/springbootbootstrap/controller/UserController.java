package ru.freeomsk.springbootbootstrap.controller;

import ru.freeomsk.springbootbootstrap.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.freeomsk.springbootbootstrap.service.UserRepository;
import ru.freeomsk.springbootbootstrap.service.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public String pageForUser (Model model, Principal principal) {
        model.addAttribute("user",userRepository.findByUsername(principal.getName()));
        return "users/userPage";
    }

    @GetMapping(value = "login")
    public String loginPage() {
        return "users/login";
    }

}
