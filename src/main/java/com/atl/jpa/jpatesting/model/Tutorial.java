package com.atl.jpa.jpatesting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Tutorial {
    private long id;
    private String title;
    private String description;
    private boolean published;
    @Override
    public String toString(){
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" +
                published + "]";
    }
}
