package com.project3.revtech.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.project3.revtech.dao.ProductRepository;
import com.project3.revtech.entity.CartItem;
import com.project3.revtech.entity.Discount;
import com.project3.revtech.entity.Product;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.ProductPojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ProductServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ProductServiceTest {
    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private ProductServiceImpl productService;

    @Test
    void testAddProductService() throws ApplicationException {
        Product product = new Product();
        product.setCartItems(new ArrayList<>());
        product.setDiscount(new Discount());
        product.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product.setImages(new ArrayList<>());
        product.setProductCategory("Phones ");
        product.setProductCost(null);
        product.setProductDescription("Hello Product Description");
        product.setProductId(123);
        product.setProductName("Nokia 123");
        product.setProductQty(1);
        product.setProductRemoved(true);
        product.setProductSku("Pro1234ductSku");

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
        product1.setProductCategory("Phone");
        product1.setProductCost(BigDecimal.valueOf(42L));
        product1.setProductDescription(" Hello Product Description");
        product1.setProductId(123);
        product1.setProductName("Nokia 123");
        product1.setProductQty(1);
        product1.setProductRemoved(true);
        product1.setProductSku("Pro1234ductSku");

        Discount discount1 = new Discount();
        discount1.setDiscountDescription("3");
        discount1.setDiscountId(3);
        discount1.setDiscountPercentage(BigDecimal.valueOf(42L));
        discount1.setProduct(product1);
        discount1.setProductId(123);

        Product product2 = new Product();
        ArrayList<CartItem> cartItemList = new ArrayList<>();
        product2.setCartItems(cartItemList);
        product2.setDiscount(discount1);
        product2.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product2.setImages(new ArrayList<>());
        product2.setProductCategory("Phone");
        product2.setProductCost(BigDecimal.valueOf(42L));
        product2.setProductDescription("Hello Product Description");
        product2.setProductId(123);
        product2.setProductName("Nokia");
        product2.setProductQty(1);
        product2.setProductRemoved(true);
        product2.setProductSku("Pro1234ductSku");
        when(this.productRepository.saveAndFlush((Product) any())).thenReturn(product2);
        ProductPojo productPojo = new ProductPojo(123, "Pro1234ductSku", "Nokia 123", BigDecimal.valueOf(42L),
                "Phone", "Hello Product Description", 1, "https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=", true);

        ProductPojo actualAddProductServiceResult = this.productService.addProductService(productPojo);
        assertSame(productPojo, actualAddProductServiceResult);
        assertEquals(123, actualAddProductServiceResult.getProductId());
        assertEquals("42", actualAddProductServiceResult.getProductCost().toString());
        verify(this.productRepository).saveAndFlush((Product) any());
        assertEquals(cartItemList, this.productService.getAllDiscountProductService());
    }

    @Test
    void testUpdateProductService() throws ApplicationException {
        Product product = new Product();
        product.setCartItems(new ArrayList<>());
        product.setDiscount(new Discount());
        product.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product.setImages(new ArrayList<>());
        product.setProductCategory("Phone");
        product.setProductCost(null);
        product.setProductDescription("Hello Product Description");
        product.setProductId(123);
        product.setProductName("Nokia 123");
        product.setProductQty(1);
        product.setProductRemoved(true);
        product.setProductSku("Pro1234ductSku");

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
        product1.setProductCategory("Phone");
        product1.setProductCost(BigDecimal.valueOf(42L));
        product1.setProductDescription("Hello Product Description");
        product1.setProductId(123);
        product1.setProductName("Nokia 123");
        product1.setProductQty(1);
        product1.setProductRemoved(true);
        product1.setProductSku("Pro1234ductSku");

        Discount discount1 = new Discount();
        discount1.setDiscountDescription("3");
        discount1.setDiscountId(3);
        discount1.setDiscountPercentage(BigDecimal.valueOf(42L));
        discount1.setProduct(product1);
        discount1.setProductId(123);

        Product product2 = new Product();
        ArrayList<CartItem> cartItemList = new ArrayList<>();
        product2.setCartItems(cartItemList);
        product2.setDiscount(discount1);
        product2.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product2.setImages(new ArrayList<>());
        product2.setProductCategory("Phone ");
        product2.setProductCost(BigDecimal.valueOf(42L));
        product2.setProductDescription("Hello Product Description");
        product2.setProductId(123);
        product2.setProductName("Nokia 123");
        product2.setProductQty(1);
        product2.setProductRemoved(true);
        product2.setProductSku("Pro1234ductSku");
        when(this.productRepository.save((Product) any())).thenReturn(product2);

        ProductPojo productPojo = new ProductPojo(123, "Pro1234ductSku", "Nokia 123", BigDecimal.valueOf(42L),
                "Phone", "Hello Product Description", 1, "https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=", true);

        ProductPojo actualUpdateProductServiceResult = this.productService.updateProductService(productPojo);
        assertSame(productPojo, actualUpdateProductServiceResult);
        assertEquals("42", actualUpdateProductServiceResult.getProductCost().toString());
        verify(this.productRepository).save((Product) any());
        assertEquals(cartItemList, this.productService.getAllDiscountProductService());
    }

    @Test
    void testDeleteProductService() throws ApplicationException {
        doNothing().when(this.productRepository).deleteById((Integer) any());
        assertTrue(this.productService.deleteProductService(123));
        verify(this.productRepository).deleteById((Integer) any());

        List<ProductPojo> expectedAllProductService = this.productService.getAllDiscountProductService();
        assertEquals(expectedAllProductService, this.productService.getAllProductService());
    }

    @Test
    void testGetAProductService() throws ApplicationException {
        Discount discount = new Discount();
        discount.setDiscountDescription("3");
        discount.setDiscountId(3);
        discount.setDiscountPercentage(null);
        discount.setProduct(new Product());
        discount.setProductId(123);

        Product product = new Product();
        product.setCartItems(new ArrayList<>());
        product.setDiscount(discount);
        product.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product.setImages(new ArrayList<>());
        product.setProductCategory("Phone");
        product.setProductCost(BigDecimal.valueOf(42L));
        product.setProductDescription("Hello Product Description");
        product.setProductId(123);
        product.setProductName("NoKia 123");
        product.setProductQty(1);
        product.setProductRemoved(true);
        product.setProductSku("Pro1234ductSku");

        Discount discount1 = new Discount();
        discount1.setDiscountDescription("3");
        discount1.setDiscountId(3);
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        discount1.setDiscountPercentage(valueOfResult);
        discount1.setProduct(product);
        discount1.setProductId(123);

        Product product1 = new Product();
        ArrayList<CartItem> cartItemList = new ArrayList<>();
        product1.setCartItems(cartItemList);
        product1.setDiscount(discount1);
        product1.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product1.setImages(new ArrayList<>());
        product1.setProductCategory("Phone");
        product1.setProductCost(BigDecimal.valueOf(42L));
        product1.setProductDescription("Hello Product Description");
        product1.setProductId(123);
        product1.setProductName("Nokia 123");
        product1.setProductQty(1);
        product1.setProductRemoved(true);
        product1.setProductSku("Pro1234ductSku");
        Optional<Product> ofResult = Optional.of(product1);
        when(this.productRepository.findById((Integer) any())).thenReturn(ofResult);
        ProductPojo actualAProductService = this.productService.getAProductService(123);
        assertEquals("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=", actualAProductService.getImageUrl());
        assertTrue(actualAProductService.isProductRemoved());
        assertEquals("Pro1234ductSku", actualAProductService.getProductSku());
        assertEquals(1, actualAProductService.getProductQty());
        assertEquals("Nokia 123", actualAProductService.getProductName());
        assertEquals(123, actualAProductService.getProductId());
        assertEquals("Hello Product Description", actualAProductService.getProductDescription());
        BigDecimal productCost = actualAProductService.getProductCost();
        assertEquals(valueOfResult, productCost);
        assertEquals("Phone", actualAProductService.getProductCategory());
        assertEquals("42", productCost.toString());
        verify(this.productRepository).findById((Integer) any());
        assertEquals(cartItemList, this.productService.getAllDiscountProductService());
    }

    @Test
    void testGetAProductService2() throws ApplicationException {
        when(this.productRepository.findById((Integer) any())).thenReturn(Optional.empty());
        assertNull(this.productService.getAProductService(123));
        verify(this.productRepository).findById((Integer) any());
        List<ProductPojo> expectedAllProductService = this.productService.getAllDiscountProductService();
        assertEquals(expectedAllProductService, this.productService.getAllProductService());
    }

    @Test
    void testGetAllProductService() throws ApplicationException {
        when(this.productRepository.findAll()).thenReturn(new ArrayList<>());
        List<ProductPojo> actualAllProductService = this.productService.getAllProductService();
        assertTrue(actualAllProductService.isEmpty());
        verify(this.productRepository).findAll();
        assertEquals(actualAllProductService, this.productService.getAllDiscountProductService());
    }


    @Test
    void testGetAllProductService2() throws ApplicationException {
        Discount discount = new Discount();
        discount.setDiscountDescription("3");
        discount.setDiscountId(3);
        discount.setDiscountPercentage(null);
        discount.setProduct(new Product());
        discount.setProductId(123);

        Product product = new Product();
        product.setCartItems(new ArrayList<>());
        product.setDiscount(discount);
        product.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product.setImages(new ArrayList<>());
        product.setProductCategory("Phone");
        product.setProductCost(BigDecimal.valueOf(42L));
        product.setProductDescription("Hello Product Description");
        product.setProductId(123);
        product.setProductName("Nokia 123");
        product.setProductQty(0);
        product.setProductRemoved(true);
        product.setProductSku("Pro123ductSku");

        Discount discount1 = new Discount();
        discount1.setDiscountDescription("3");
        discount1.setDiscountId(3);
        discount1.setDiscountPercentage(BigDecimal.valueOf(42L));
        discount1.setProduct(product);
        discount1.setProductId(123);

        Product product1 = new Product();
        product1.setCartItems(new ArrayList<>());
        product1.setDiscount(discount1);
        product1.setImageUrl("https://media.istockphoto.com/photos/newly-released-iphone-13-pro-mockup-set-with-back-and-front-angles-picture-id1356372494?k=20&m=1356372494&s=612x612&w=0&h=4IyK75PK9dd4zY-CPAF_scPK-HwsoYS2mmWJZzBwp2A=");
        product1.setImages(new ArrayList<>());
        product1.setProductCategory("Phone ");
        product1.setProductCost(BigDecimal.valueOf(42L));
        product1.setProductDescription("Hello Product Description");
        product1.setProductId(123);
        product1.setProductName("Nokia 123");
        product1.setProductQty(0);
        product1.setProductRemoved(true);
        product1.setProductSku("Pro1234ductSku");

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        when(this.productRepository.findAll()).thenReturn(productList);
        assertEquals(1, this.productService.getAllProductService().size());
        verify(this.productRepository).findAll();
        assertEquals(1, this.productService.getAllDiscountProductService().size());
    }

}

