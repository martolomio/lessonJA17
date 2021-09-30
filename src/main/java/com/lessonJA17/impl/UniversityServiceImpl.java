package com.lessonJA17.impl;

import com.lessonJA17.domian.University;
import com.lessonJA17.service.UniversityService;
import com.lessonJA17.service.dao.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversityServiceImpl implements UniversityService {
   @Autowired
   private UniversityRepository universityRepository;

    @Override
    public University save(University university) {
        return universityRepository.saveAndFlush(university);
    }

    @Override
    public University findById(Long id) {
        return universityRepository.getById(id);
    }

    @Override
    public University update(University university) {
        return universityRepository.save(university);
    }

    @Override
    public void deleteById(Long id) {
        universityRepository.deleteById(id);
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public List<University> findByName(String name) {
        return universityRepository.findByName(name);
    }

    @Override
    public List<University> findByAddress(String address) {
        return universityRepository.findByAddress(address);
    }
}
