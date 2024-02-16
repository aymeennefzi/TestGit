package com.example.testgit.Controller;

import com.example.testgit.Entity.Alaa;
import com.example.testgit.Entity.Aymen;
import com.example.testgit.Service.IAlaService;
import com.example.testgit.Service.IAymenSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AlaController {
    private final IAlaService iAlaService;

    @PostMapping("/addala")
    public Alaa ajouter(@RequestBody Alaa alaa) {
        return iAlaService.ajouter(alaa);}
}
