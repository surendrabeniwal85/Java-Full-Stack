package JAVA.Day09;

//Coding with the help of AI 

import java.math.BigDecimal;
import java.util.List;

public class Product {
	private Long id;
	private String name;
	private BigDecimal price;
	private List<String> tags;

	public Product() {
	}

	public Product(Long id, String name, BigDecimal price, List<String> tags) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tags = tags;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;

	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Product{id=" + id + ", name='" + name + "', price=" + price + ", tags=" + tags + "}";
	}
}