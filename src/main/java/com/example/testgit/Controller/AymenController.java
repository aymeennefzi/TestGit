package com.example.testgit.Controller;

import com.example.testgit.Entity.Aymen;
import com.example.testgit.Service.IAymenSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AymenController {
    private final IAymenSerivce iAymenSerivce ;

    @PostMapping("/adda")
    public Aymen ajouter(@RequestBody Aymen aymen) {
    return iAymenSerivce.ajouter(aymen);
    }
}
