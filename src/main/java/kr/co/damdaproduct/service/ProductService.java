package kr.co.damdaproduct.service;

import kr.co.damdaproduct.jpa.ProductEntity;
import kr.co.damdaproduct.jpa.ProductRepository;
import kr.co.dto.ResponseProductDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    /**
     * all product info read service
     * @return all product info
     */
    public List<ResponseProductDto.READ_PRODUCT_INFO> getAllProductsInfo(){
        final List<ResponseProductDto.READ_PRODUCT_INFO> readProductInfos = ProductEntity.of(productRepository.findAll());
        return readProductInfos;
    }
}
