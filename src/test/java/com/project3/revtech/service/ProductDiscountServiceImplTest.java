package com.project3.revtech.service;

import com.project3.revtech.dao.DiscountRepository;
import com.project3.revtech.dao.ProductRepository;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.joinedPojo.ProductAndDiscountPojo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static com.project3.revtech.prototype.CartAndItemsPojoPrototype.productAndDiscountPojoTestObj;
import static com.project3.revtech.prototype.CartAndItemsPojoPrototype.productTestObj;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ContextConfiguration( classes = {ProductDiscountServiceImpl.class})
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
class ProductDiscountServiceImplTest {

    @MockBean
    ProductRepository productRepository;

    @MockBean
    DiscountRepository discountRepository;

    @Autowired
    ProductDiscountServiceImpl productDiscountService;

    @Test
    void getAllDiscountedProducts() throws ApplicationException {
        when(productRepository.getById(eq(1))).thenReturn(productTestObj());
        ProductAndDiscountPojo productAndDiscountPojo = productDiscountService.getOneProductWithDiscount(1);
        assertNotNull(productAndDiscountPojo);
        assertEquals(productAndDiscountPojoTestObj().toString(), productAndDiscountPojo.toString());
    }
}