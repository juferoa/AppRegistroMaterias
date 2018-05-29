package co.com.poli.AppRegistroMaterias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class StatusController {
    
    @GetMapping("/status")
    public String status(){
        return "ServiChicho corriendo";
    }
}
