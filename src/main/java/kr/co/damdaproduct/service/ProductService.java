package kr.co.damdaproduct.service;

import kr.co.damdaproduct.dto.ResponseDto;
import kr.co.damdaproduct.jpa.ProductEntity;
import kr.co.damdaproduct.jpa.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ResponseDto.READ_PRODUCT_INFO> getAllProductsInfo(){
        final List<ResponseDto.READ_PRODUCT_INFO> readProductInfos = ProductEntity.of(productRepository.findAll());
        return readProductInfos;
    }
}
