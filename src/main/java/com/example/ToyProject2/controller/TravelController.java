package com.example.ToyProject2.controller;

import com.example.ToyProject2.domain.entity.Trip;
import com.example.ToyProject2.dto.TripResponseDto;
//import com.example.ToyProject2.service.ItineraryService;
import com.example.ToyProject2.service.TravelService;
import com.example.ToyProject2.service.TripService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TravelController {
    private final TravelService travelService;
    @GetMapping("/trips")
    public List<TripResponseDto> getAllTrips(){
        return travelService.findAllTrips();
    }
    @PostMapping("/trips")
    public ResponseEntity saveTrip(@RequestBody Trip trip ){

        return new ResponseEntity(HttpStatus.CREATED);
    }

    /**
     * <URL, method>
     * 상품 여러개 등록 : POST /products
     *                REQ - List<ProductDto>, RES - 201, + redirect 전체조회
     * 상품 개별 등록 : POST /products
     *               REQ - ProductDto(상품 이름, 내용, 가격 ...) RES - 201, + redirect ...
     * 상품 전체 조회 : GET /products
     *               REQ X RES - List<ProductDto>
     * 상품 개별 조회 : GET /products/{id}
     *               REQ - id , RES - ProductDto
     * 상품 (개별) 수정 : PUT, PATCH /products/{id}
     *                 REQ - id, ProductDto(ProductUpdateRequest) , RES - (수정된) ProductDto, 200, id
     *                 cf. 리다이렉트, 개별조회
     *          호출 : 1) 수정 페이지 들어갈때 2) 수정 다하고 [저장(수정)] 버튼 누를 때
     * 상품 전체 삭제 : DELETE /products
     *               REQ X / RES - 리다이렉트, 전체 조회, 200, ...
     * 상품 개별 삭제 : DELETE /products/{id}
     *               REQ - id, RES - 리다이렉트, 전체 조회, 200 + 삭제된 상품 id ...
     */
}
