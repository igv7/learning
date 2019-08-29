package com.lombok;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Component
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LombokBeanC {
     
    private int value;
    private boolean flag;
    private String  word;
 
}
