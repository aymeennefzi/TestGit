package com.example.testgit.Service;

import com.example.testgit.Entity.Aymen;
import com.example.testgit.Repo.IAymenRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AymenSerivceImple implements IAymenSerivce {
    private final IAymenRepo aymenRepo ;
    @Override
    public Aymen ajouter(Aymen aymen) {
        return aymenRepo.save(aymen);
    }
}
