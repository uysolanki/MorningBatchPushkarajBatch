package day27.colletionday6.mapinterfacecont;

public class Product {
	
	private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private Rating rating;
    
    public Product() {}
	public Product(int id, String title, double price, String description, String category, String image,
			Rating rating) {
		
		this.id = id;
		this.title = title;
		this.price = price;
		this.description = description;
		this.category = category;
		this.image = image;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description
				+ ", category=" + category + ", image=" + image + ", rating=" + rating + "]";
	}
    
    
    
    

}
