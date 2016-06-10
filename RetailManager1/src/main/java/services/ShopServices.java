package services;

import java.math.BigInteger;
import java.util.Collection;

import model.Shop;

public interface ShopServices {
	Collection<Shop> findAll();
	Shop findLong(BigInteger longitude);

}
