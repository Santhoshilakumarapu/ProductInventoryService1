package net.java.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.java.bean.ProductEnquiryBean;


//@FeignClient(name="product-stock-service",url ="localhost:8888")
@FeignClient(name="product-stock-service")
public interface ProductStockClient {
	
	@GetMapping("/check-product-stock/{productName}/{productAvailability}")
	public ProductEnquiryBean checkProductStock(@PathVariable String productName, @PathVariable String productAvailability);

}


