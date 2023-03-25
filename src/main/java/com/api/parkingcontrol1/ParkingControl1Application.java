package com.api.parkingcontrol1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControl1Application {

    public static void main(String[] args) {
        SpringApplication.run(ParkingControl1Application.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "<h1>Hello World</h1>";
    }

}
