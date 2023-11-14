package com.netology.daohibarnate.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class MethodController {

    @GetMapping("Read")
    @Secured({"ROLE_READ"})
    public String readSomething() {
        return "read";
    }

    @GetMapping("Delete")
    @RolesAllowed({"ROLE_DELETE"})
    public String deleteSomething() {
        return "delete";
    }

    @GetMapping("Do")
    @PreAuthorize("hasRole('WRITE') or hasRole('DELETE')")
    public String doSomething() {
        return "do something";
    }

    @GetMapping("Get")
    @PostAuthorize("returnObject==authentication.principal.username")
    public String checkUsername(@RequestParam String username) {
        return username;
    }

}
