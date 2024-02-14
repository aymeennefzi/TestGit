package com.example.testgit.Controller;

import com.example.testgit.Entity.Test1;
import com.example.testgit.Service.ITest1Service;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerTest {
    private final ITest1Service iTest1Service ;
    @PostMapping("/add")
    public Test1 ajouter (@RequestBody Test1 test1){
        return iTest1Service.ajouter(test1);
    }

}
