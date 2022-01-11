package com.project3.revtech.service;

import com.project3.revtech.dao.CartItemRepository;
import com.project3.revtech.dao.CartRepository;
import com.project3.revtech.dao.DiscountRepository;
import com.project3.revtech.dao.ProductRepository;
import com.project3.revtech.entity.Cart;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.joinedPojo.CartAndItemsPojo;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static com.project3.revtech.prototype.CartAndItemsPojoPrototype.*;
import static com.project3.revtech.prototype.CartAndItemsPojoPrototype.cartAndItemsTestObj;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;


@ContextConfiguration(classes = {   CartItemProductServiceImpl.class,
                                    CartItemServiceImpl.class,
                                    ProductDiscountServiceImpl.class,
                                    ProductServiceImpl.class,
                                    CartServiceImpl.class})
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
public class CartItemProductServiceTest {
    @MockBean
    private CartRepository cartRepository;

    @MockBean
    private CartItemRepository cartItemRepository;

    @MockBean
    private ProductRepository productRepository;

    @MockBean
    private DiscountRepository discountRepository;

    @Autowired
    CartItemProductServiceImpl cartItemProductService;

    @Autowired
    CartItemServiceImpl cartItemService;

    @Autowired
    ProductServiceImpl productService;

    @Autowired
    CartService cartService;

    @Before
    public void beforeClass() {
    }

    @Test
    public void testGetCartItemProductServiceByUser() throws ApplicationException {
        when(cartRepository.findByUserIdAndCartRemovedFalseAndCartPaidFalse(eq(1))).thenReturn(cartTestObj());
        CartAndItemsPojo cartAndItems = cartItemProductService.getAllCartItemProductsForUser(1);
        CartAndItemsPojo testObj = cartAndItemsTestObj();
        assertNotNull(cartAndItems);
        assertEquals(1, cartAndItems.getUserId());
        assertEquals(testObj.toString(), cartAndItems.toString());

    }
    @Test
    public void testGetCartItemProductService() throws ApplicationException {
        when(cartRepository.getById(eq(1))).thenReturn(cartTestObj());
        CartAndItemsPojo cartAndItems = cartItemProductService.getAllCartItemProducts(1);
        CartAndItemsPojo testObj = cartAndItemsTestObj();
        assertNotNull(cartAndItems);
        assertEquals(1, cartAndItems.getUserId());
        assertEquals(testObj.toString(), cartAndItems.toString());
    }



}
