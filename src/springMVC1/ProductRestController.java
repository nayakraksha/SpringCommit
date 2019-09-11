package springMVC1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	private List<Product> products = new ArrayList<>();

	public ProductRestController() {
		products.add(new Product("1", "Pen", 100));
		products.add(new Product("2", "Marker", 150));
	}

	// @GetMapping("/products")
	@RequestMapping(path = "/products", method = RequestMethod.GET)
	public List<Product> getProducts() {
		return products;
	}

	@PostMapping("/products")
	void add(@RequestBody Product p) {
		products.add(p);
	}
	
	@DeleteMapping("/products/{code}")
	public void delete(@PathVariable("code") String code)
	{
		Iterator<Product> i=products.iterator();
		while(i.hasNext())
		{
			Product p=i.next();
			if(p.getCode()==code)
			{
				products.remove(code);
			}
		}
	}
	
	@PutMapping("/products/{code}")
	public void delete(@PathVariable("code") String code,@RequestBody Product p)
	{
		delete(code);
		//add(p);
	}
}
