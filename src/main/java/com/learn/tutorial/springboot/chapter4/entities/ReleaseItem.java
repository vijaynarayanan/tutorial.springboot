package com.learn.tutorial.springboot.chapter4.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReleaseItem {
    private String itemId;
    private String itemDescription;
}
