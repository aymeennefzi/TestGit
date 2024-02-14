package com.example.testgit.Service;

import com.example.testgit.Entity.Test1;
import com.example.testgit.Repo.ITest1rEPO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Test1ServiceImple implements ITest1Service{
    private final ITest1rEPO iTest1rEPO ;
    @Override
    public Test1 ajouter(Test1 test1) {
        return iTest1rEPO.save(test1);
    }
}
