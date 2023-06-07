package com.atl.jpa.jpatesting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TutorialDTO {
    private long id;
    private String title;
    private String description;
    private boolean published;
}
