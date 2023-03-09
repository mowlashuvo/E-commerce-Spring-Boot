package com.crackpot.eshop.global;

import com.crackpot.eshop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;

    static {
        cart = new ArrayList<Product>();
    }
}
