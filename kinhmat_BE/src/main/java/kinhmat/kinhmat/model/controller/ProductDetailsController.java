package kinhmat.kinhmat.model.controller;

import kinhmat.kinhmat.ServiceImpl.ProductDetailsServiceImpl;
import kinhmat.kinhmat.model.bean.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "product")
public class ProductDetailsController {
    @Autowired
    ProductDetailsServiceImpl service;

    @GetMapping(value = {"/", "/list"})
    public ResponseEntity<Page<ProductDetails>> findAllProductDetails(@PageableDefault(size = 9) Pageable pageable){
        Page<ProductDetails> listProductDetails = this.service.findAllProductDetails(pageable);
        if (listProductDetails.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(listProductDetails, HttpStatus.OK);
    }

//    @GetMapping(value = "/create")
//    public ResponseEntity<ProductDetails> createProductDetails(){
//
//    }

}
