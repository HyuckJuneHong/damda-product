package kr.co.damdaproduct.controller;

import io.swagger.annotations.ApiOperation;
import kr.co.damdaproduct.dto.ResponseDto;
import kr.co.damdaproduct.error.model.ResponseFormat;
import kr.co.damdaproduct.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
@Slf4j
public class ProductController {

    private final ProductService productService;

    @ApiOperation("상품 등록 / 관리자만")
    @PostMapping
    public ResponseFormat<String> createProduct(){
        //TODO create product api
        return null;
    }

    @ApiOperation("모든 상품 정보 조회")
    @GetMapping("/all")
    public ResponseFormat<List<ResponseDto.READ_PRODUCT_INFO>> getAllProductsInfo(){
        return ResponseFormat.ok(productService.getAllProductsInfo());
    }

    @ApiOperation("상품 삭제 / 관리자만")
    @DeleteMapping
    public ResponseFormat<String> deleteProduct(){
        // TODO delete product service
        return null;
    }
}
