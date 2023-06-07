package com.atl.jpa.jpatesting.service;

import com.atl.jpa.jpatesting.dto.TutorialDTO;
import com.atl.jpa.jpatesting.entity.TutorialJpa;

import java.util.List;

public interface TutorialService {
    TutorialJpa create(TutorialDTO tutorial);

    void update(TutorialDTO tutorial);

    public TutorialJpa getByID(Long id) throws Throwable;
    public void deleteByID(long id);
    public void deleteAll();
    List<TutorialJpa> getAll();
}
