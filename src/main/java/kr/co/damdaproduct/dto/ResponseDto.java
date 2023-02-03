package kr.co.damdaproduct.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

public class ResponseDto {

    @Getter
    @Builder
    @AllArgsConstructor
    public static class READ_PRODUCT_INFO{
        private String productCode;

        private String productName;

        private int price;

        private int amount;

        private LocalDateTime createdAt;
    }

}
