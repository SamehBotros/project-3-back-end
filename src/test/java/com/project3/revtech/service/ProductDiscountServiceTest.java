package com.project3.revtech.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.project3.revtech.dao.DiscountRepository;
import com.project3.revtech.dao.ProductRepository;
import com.project3.revtech.entity.CartItem;
import com.project3.revtech.entity.Discount;
import com.project3.revtech.entity.Product;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.joinedPojo.ProductAndDiscountPojo;

import java.math.BigDecimal;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ProductDiscountServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ProductDiscountServiceTest {
    @MockBean
    private DiscountRepository discountRepository;

    @Autowired
    private ProductDiscountServiceImpl productDiscountService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    void testGetAllDiscountedProducts() throws ApplicationException {
        when(this.discountRepository.findAll()).thenReturn(new ArrayList<>());
        assertTrue(this.productDiscountService.getAllDiscountedProducts().isEmpty());
        verify(this.discountRepository).findAll();
    }

    @Test
    void testGetAllDiscountedProducts2() throws ApplicationException {
        Product product = new Product();
        product.setCartItems(new ArrayList<>());
        product.setDiscount(new Discount());
        product.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product.setImages(new ArrayList<>());
        product.setProductCategory("Laptop");
        product.setProductCost(null);
        product.setProductDescription("Hi Product Description");
        product.setProductId(123);
        product.setProductName("Dell 123");
        product.setProductQty(2);
        product.setProductRemoved(true);
        product.setProductSku("Pro567ductSku");

        Discount discount = new Discount();
        discount.setDiscountDescription("3");
        discount.setDiscountId(3);
        discount.setDiscountPercentage(BigDecimal.valueOf(42L));
        discount.setProduct(product);
        discount.setProductId(123);

        Product product1 = new Product();
        product1.setCartItems(new ArrayList<>());
        product1.setDiscount(discount);
        product1.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product1.setImages(new ArrayList<>());
        product1.setProductCategory("Laptop");
        product1.setProductCost(BigDecimal.valueOf(42L));
        product1.setProductDescription("Hi Product Description");
        product1.setProductId(123);
        product1.setProductName("Dell 123");
        product1.setProductQty(2);
        product1.setProductRemoved(true);
        product1.setProductSku("Pro567ductSku");

        Discount discount1 = new Discount();
        discount1.setDiscountDescription("3");
        discount1.setDiscountId(3);
        discount1.setDiscountPercentage(BigDecimal.valueOf(42L));
        discount1.setProduct(product1);
        discount1.setProductId(123);

        ArrayList<Discount> discountList = new ArrayList<>();
        discountList.add(discount1);
        when(this.discountRepository.findAll()).thenReturn(discountList);
        assertEquals(1, this.productDiscountService.getAllDiscountedProducts().size());
        verify(this.discountRepository).findAll();
    }

    @Test
    void testGetOneProductWithDiscount() throws ApplicationException {
        Product product = new Product();
        product.setCartItems(new ArrayList<>());
        product.setDiscount(new Discount());
        product.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product.setImages(new ArrayList<>());
        product.setProductCategory("Laptop");
        product.setProductCost(null);
        product.setProductDescription("Hi Product Description");
        product.setProductId(123);
        product.setProductName("Dell 123");
        product.setProductQty(1);
        product.setProductRemoved(true);
        product.setProductSku("Pro567ductSku");

        Discount discount = new Discount();
        discount.setDiscountDescription("3");
        discount.setDiscountId(3);
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        discount.setDiscountPercentage(valueOfResult);
        discount.setProduct(product);
        discount.setProductId(123);

        Product product1 = new Product();
        product1.setCartItems(new ArrayList<>());
        product1.setDiscount(discount);
        product1.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product1.setImages(new ArrayList<>());
        product1.setProductCategory("Laptop");
        product1.setProductCost(BigDecimal.valueOf(42L));
        product1.setProductDescription("Hi Product Description");
        product1.setProductId(123);
        product1.setProductName("Dell 123");
        product1.setProductQty(1);
        product1.setProductRemoved(true);
        product1.setProductSku("Pro567ductSku");

        Discount discount1 = new Discount();
        discount1.setDiscountDescription("3");
        discount1.setDiscountId(3);
        BigDecimal valueOfResult1 = BigDecimal.valueOf(42L);
        discount1.setDiscountPercentage(valueOfResult1);
        discount1.setProduct(product1);
        discount1.setProductId(123);

        Product product2 = new Product();
        ArrayList<CartItem> cartItemList = new ArrayList<>();
        product2.setCartItems(cartItemList);
        product2.setDiscount(discount1);
        product2.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product2.setImages(new ArrayList<>());
        product2.setProductCategory("Laptop");
        product2.setProductCost(BigDecimal.valueOf(42L));
        product2.setProductDescription("Hi Product Description");
        product2.setProductId(123);
        product2.setProductName("Dell 123");
        product2.setProductQty(1);
        product2.setProductRemoved(true);
        product2.setProductSku("Pro567ductSku");
        when(this.productRepository.getById((Integer) any())).thenReturn(product2);
        ProductAndDiscountPojo actualOneProductWithDiscount = this.productDiscountService
                .getOneProductWithDiscount(123);
        assertEquals("3", actualOneProductWithDiscount.getDiscountDescription());
        assertTrue(actualOneProductWithDiscount.isProductRemoved());
        assertEquals("Pro567ductSku", actualOneProductWithDiscount.getProductSku());
        assertEquals(1, actualOneProductWithDiscount.getProductQty());
        assertEquals("Dell 123", actualOneProductWithDiscount.getProductName());
        assertEquals(123, actualOneProductWithDiscount.getProductId());
        assertEquals("Hi Product Description", actualOneProductWithDiscount.getProductDescription());
        BigDecimal productCost = actualOneProductWithDiscount.getProductCost();
        assertEquals(valueOfResult1, productCost);
        assertEquals("Laptop", actualOneProductWithDiscount.getProductCategory());
        assertEquals(3, actualOneProductWithDiscount.getDiscountId());
        assertEquals("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=", actualOneProductWithDiscount.getImageUrl());
        BigDecimal discountPercentage = actualOneProductWithDiscount.getDiscountPercentage();
        assertEquals(valueOfResult, discountPercentage);
        assertEquals("42", productCost.toString());
        assertEquals("42", discountPercentage.toString());
        verify(this.productRepository).getById((Integer) any());
        assertEquals(cartItemList, this.productDiscountService.getAllDiscountedProducts());
    }
}

