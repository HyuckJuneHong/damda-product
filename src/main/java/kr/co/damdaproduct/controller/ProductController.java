package kr.co.damdaproduct.controller;

import kr.co.damdaproduct.dto.ResponseDto;
import kr.co.damdaproduct.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<ResponseDto.READ_PRODUCT_INFO>> getAllProductsInfo(){
        return ResponseEntity.ok().body(productService.getAllProductsInfo());
    }
}
