package com.rood.pokedexspring.controllers;

import com.rood.pokedexspring.user.User;
import com.rood.pokedexspring.user.UserService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping
//    public void getRegisterForm(ModelMap modelMap) {
//        modelMap.addAttribute("person", new User());
//    }
//
//    @PostMapping
//    public String register(ModelMap modelMap, @Validated User user, BindingResult bindingResult) {
//        modelMap.addAttribute("person", user);
//        if (bindingResult.hasErrors()) {
//            return "register";
//        }
//        try {
//            userService.save(user);
//        } catch (DataIntegrityViolationException e) {
//            modelMap.addAttribute("usernameAlreadyExists", true);
//            return "register";
//        } catch (BadCredentialsException a) {
//            modelMap.addAttribute("wrongPassword", true);
//            return "register";
//
//        }
//        return "redirect:/";
//    }
}
