package controller;

import java.math.BigInteger;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Shop;
import services.ShopServices;

@RestController
public class ShopController {
	
	@Autowired
	private ShopServices shopservices;
	
	
	@RequestMapping(
			value="/api/shops",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Collection<Shop>> getShops(){
		Collection<Shop> shops=shopservices.findAll();
		return new ResponseEntity<Collection<Shop>>(shops, HttpStatus.OK);
	}
	
	@RequestMapping(
			value="/api/shops/{longitude}" ,
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Shop> getGreeting(@PathVariable("longitude") BigInteger longitude){
		Shop shop=shopservices.findLong(longitude);
		if(shop==null){
			return new ResponseEntity<Shop>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Shop>(shop,HttpStatus.OK);
	}

}
