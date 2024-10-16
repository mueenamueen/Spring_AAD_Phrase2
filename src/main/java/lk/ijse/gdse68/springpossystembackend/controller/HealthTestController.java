package lk.ijse.gdse68.springpossystembackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/healthTest")
@RequiredArgsConstructor
public class HealthTestController {
    @GetMapping
    public String healthTest(){
        return "Server Controller run Successfully!!";
    }
}
