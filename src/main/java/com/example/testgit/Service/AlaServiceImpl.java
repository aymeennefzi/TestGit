package com.example.testgit.Service;

import com.example.testgit.Entity.Alaa;
import com.example.testgit.Entity.Aymen;
import com.example.testgit.Repo.IAlaRepo;
import com.example.testgit.Repo.IAymenRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlaServiceImpl implements IAlaService{
    private final IAlaRepo iAlaRepo;
    @Override
    public Alaa ajouter(Alaa alaa) {
        return iAlaRepo.save(alaa);}
}
