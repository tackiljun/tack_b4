package org.jeroex.b4.service;

import java.util.List;

import org.jeroex.b4.dto.PageRequestDTO;
import org.jeroex.b4.dto.PageResponseDTO;
import org.jeroex.b4.dto.ProductDTO;
import org.jeroex.b4.dto.ProductListDTO;
import org.jeroex.b4.dto.ProductRegisterDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductService {

    Integer register(ProductRegisterDTO registerDTO);

    PageResponseDTO<ProductListDTO> list(PageRequestDTO pageRequestDTO);
    // ///////////////<제네릭타입>

    ProductDTO get(Integer pno);

    List<String> getImage(Integer pno);

    void modify(ProductDTO dto);

    // 트랜잭션.
    // 파라미터 리턴타입 void (특별한 경우가 아닌 이상 성공 / 아니면 예외처리).
    //step4. 
    //void modify(//DTO);
    // 상품데이터 수정.
    // 기존의 첨부파일을 데이터베이스 내에서 삭제.
    // DTO에 있는 첨부파일을 데이터베이스에 추가.


}
