package kr.co.damdaproduct.jpa;

import kr.co.damdaproduct.dto.ResponseDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_product")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductEntity {

    @Id @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "product_code", length = 100, unique = true, nullable = false)
    private String productCode;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "price", nullable = false)
    private int price;

    @Builder
    public ProductEntity(String productCode,
                         String productName,
                         int amount,
                         int price) {
        this.productCode = productCode;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public static ResponseDto.READ_PRODUCT_INFO of(ProductEntity productEntity){
        return ResponseDto.READ_PRODUCT_INFO.builder()
                .productCode(productEntity.getProductCode())
                .productName(productEntity.productName)
                .amount(productEntity.amount)
                .price(productEntity.price)
                .build();
    }

    public static List<ResponseDto.READ_PRODUCT_INFO> of(List<ProductEntity> productEntities){
        List<ResponseDto.READ_PRODUCT_INFO> readProductInfos = new ArrayList<>();

        for(ProductEntity productEntity : productEntities){
            ResponseDto.READ_PRODUCT_INFO readProductInfo = ProductEntity.of(productEntity);
            readProductInfos.add(readProductInfo);
        }

        return readProductInfos;
    }
}
