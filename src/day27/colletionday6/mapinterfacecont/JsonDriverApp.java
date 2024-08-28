package day27.colletionday6.mapinterfacecont;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDriverApp {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
//		 ObjectMapper objectMapper = new ObjectMapper();
//		 File file = new File("D:/ExcelRMorningBatch2/jsondata/product.json");
//		 Product product = objectMapper.readValue(file, Product.class);
//		 System.out.println(product);
		 
		 
//		 ObjectMapper objectMapper = new ObjectMapper();
//		 File file = new File("D:/ExcelRMorningBatch2/jsondata/allproducts.json");
//		 List<Product> products =Arrays.asList(objectMapper.readValue(file, Product[].class));
//		 System.out.println(products);
//		 int totalRating=0;
//		 for(Product p: products)
//		 {
//			totalRating+=p.getRating().getCount();
//		 }
//		 
//		 System.out.println(totalRating);
//		 System.out.println("Average Count of Votes" + totalRating/products.size());
		
		 ObjectMapper objectMapper = new ObjectMapper();
		 File file = new File("D:/ExcelRMorningBatch2/jsondata/onlyproductnorating.json");
		 MyProduct myproduct = objectMapper.readValue(file, MyProduct.class);
		 System.out.println(myproduct);
		 
		 
	}

}
