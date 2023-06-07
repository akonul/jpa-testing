package com.atl.jpa.jpatesting.controller;

import com.atl.jpa.jpatesting.dto.TutorialDTO;
import com.atl.jpa.jpatesting.entity.TutorialJpa;
import com.atl.jpa.jpatesting.model.Tutorial;
import com.atl.jpa.jpatesting.service.TutorialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tutorials")
public class TutorialApp  {
    private final TutorialService tutorialService ;

    @GetMapping("/test")
    public String test(){
        return ("TEST");
    }
    @PostMapping("new")
    public ResponseEntity<TutorialJpa> newTutorial(@RequestBody TutorialDTO tutorial){
        return ResponseEntity.ok().body(tutorialService.create(tutorial));
    }
    @GetMapping("/getall")
    public ResponseEntity<List<TutorialJpa>> all(){
       return ResponseEntity.ok(tutorialService.getAll());
    }
    @GetMapping("get")
    public TutorialJpa get(@RequestParam long id) throws Throwable {
        return tutorialService.getByID(id);
    }

@PutMapping("update")
    public void update(@RequestBody TutorialDTO tutorial){
         tutorialService.update(tutorial);
};
@DeleteMapping("delete")
    public void delete(@RequestParam long id) {
     tutorialService.deleteByID(id);
}
@DeleteMapping("deleteall")
    public void drop(){
     tutorialService.deleteAll();
};

}
