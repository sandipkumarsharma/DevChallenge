package services;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import model.Shop;

@Service
public class ShopServicesImp implements ShopServices {

	private static BigInteger nextLongitude;
	private  static Map<BigInteger,Shop> shopMap;
	
	private static Shop save(Shop shop){
		if(shopMap==null){
			shopMap=new HashMap<BigInteger,Shop>();
			nextLongitude=BigInteger.ONE;
		}
		shop.setLongitude(nextLongitude);;
		nextLongitude=nextLongitude.add(BigInteger.ONE);
		shopMap.put(shop.getLongitude(), shop);
		return shop;
}

	static{
		Shop s1=new Shop();
		s1.setAddressNumber(11);
		s1.setShopName("Inorbit");
		s1.setShopPostCode(123456);
		s1.setLatitude(8888);
		save(s1);
		
		Shop s2=new Shop();
		s2.setAddressNumber(22);
		s2.setShopName("Phonix");
		s2.setShopPostCode(234567);
		s2.setLatitude(2222);
		save(s2);
		
		Shop s3=new Shop();
		s3.setAddressNumber(33);
		s3.setShopName("Centrail");
		s3.setShopPostCode(234568);
		s3.setLatitude(3344);
		save(s3);
		
		
	}
	@Override
	public Collection<Shop> findAll() {
		Collection<Shop> shops=shopMap.values();
		return shops;
	}
	@Override
	public Shop findLong(BigInteger longitude) {
		Shop shop=shopMap.get(longitude);
		return shop;
	}
	
	

}
