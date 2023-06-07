package com.atl.jpa.jpatesting.service;

import com.atl.jpa.jpatesting.dto.TutorialDTO;
import com.atl.jpa.jpatesting.entity.TutorialJpa;
import com.atl.jpa.jpatesting.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TutorialServiceImpl implements TutorialService {
    private final TutorialRepository tutorialRepository;
    @Override
    public TutorialJpa create(TutorialDTO tutorial) {
        TutorialJpa tutorialJpa = new TutorialJpa();
        tutorialJpa.setTitle(tutorial.getTitle());
        tutorialJpa.setId(tutorial.getId());
        tutorialJpa.setDescription(tutorial.getDescription());
        tutorialJpa.setPublished(tutorial.isPublished());
        return tutorialRepository.save(tutorialJpa);
    }

    @Override
    public void update(TutorialDTO tutorial) {
        TutorialJpa tutorialJpa =  tutorialRepository.findById(tutorial.getId()).orElseThrow(RuntimeException::new);
        tutorialJpa.setDescription(tutorial.getDescription());
        tutorialJpa.setId(tutorial.getId());
        tutorialJpa.setPublished(tutorial.isPublished());
        tutorialJpa.setTitle(tutorial.getTitle());
    }

    @Override
    public TutorialJpa getByID(Long id) throws Throwable {
        return tutorialRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public void deleteByID(long id) {
         tutorialRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
         tutorialRepository.deleteAll();
    }

    @Override
    public List<TutorialJpa> getAll() {
        return tutorialRepository.findAll();
    }

}
