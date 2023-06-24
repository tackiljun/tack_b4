package org.jeroex.b4.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Integer pno;
    private String pname;
    private int price;
    private boolean status;
    private String regDate, modDate;

    private List<String> fileNames;
    
}
