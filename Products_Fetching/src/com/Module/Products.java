package com.Module;



public class Products {
		
		int id;
		String title;
		String description;
		String category;
		double price;
		double discountPercentage;
		double rating;
		int stock;
		String brand;
		String sku;
		double weight;
		String warrantyInformation;
		String shippingInformation;
		String availabilityStatus;
		String returnPolicy;
		int minimumOrderQuantity;
		String thumbnail;	
		
		
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


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public double getDiscountPercentage() {
			return discountPercentage;
		}


		public void setDiscountPercentage(double discountPercentage) {
			this.discountPercentage = discountPercentage;
		}


		public double getRating() {
			return rating;
		}


		public void setRating(double rating) {
			this.rating = rating;
		}


		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public String getSku() {
			return sku;
		}


		public void setSku(String sku) {
			this.sku = sku;
		}


		public double getWeight() {
			return weight;
		}


		public void setWeight(double weight) {
			this.weight = weight;
		}


		public String getWarrantyInformation() {
			return warrantyInformation;
		}


		public void setWarrantyInformation(String warrantyInformation) {
			this.warrantyInformation = warrantyInformation;
		}


		public String getShippingInformation() {
			return shippingInformation;
		}


		public void setShippingInformation(String shippingInformation) {
			this.shippingInformation = shippingInformation;
		}


		public String getAvailabilityStatus() {
			return availabilityStatus;
		}


		public void setAvailabilityStatus(String availabilityStatus) {
			this.availabilityStatus = availabilityStatus;
		}


		public String getReturnPolicy() {
			return returnPolicy;
		}


		public void setReturnPolicy(String returnPolicy) {
			this.returnPolicy = returnPolicy;
		}


		public int getMinimumOrderQuantity() {
			return minimumOrderQuantity;
		}


		public void setMinimumOrderQuantity(int minimumOrderQuantity) {
			this.minimumOrderQuantity = minimumOrderQuantity;
		}


		public String getThumbnail() {
			return thumbnail;
		}


		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}


		 public Products() {
			// TODO Auto-generated constructor stub
		}
		   
		 public Products( String title, String description, String category, double price,
				double discountPercentage, double rating, int stock, String brand, String sku, double weight,
				String warrantyInformation, String shippingInformation, String availabilityStatus, String returnPolicy,
				int minimumOrderQuantity, String thumbnail) {
			super();
			
			this.title = title;
			this.description = description;
			this.category = category;
			this.price = price;
			this.discountPercentage = discountPercentage;
			this.rating = rating;
			this.stock = stock;
			this.brand = brand;
			this.sku = sku;
			this.weight = weight;
			this.warrantyInformation = warrantyInformation;
			this.shippingInformation = shippingInformation;
			this.availabilityStatus = availabilityStatus;
			this.returnPolicy = returnPolicy;
			this.minimumOrderQuantity = minimumOrderQuantity;
			this.thumbnail = thumbnail;
		}


		   @Override
		   public String toString() {
			   return "-------------------------------------------\n" +
			           "Product Details\n" +
			           "-------------------------------------------\n" +
			           "ID                     : " + id + "\n" +
			           "Title                  : " + title + "\n" +
			           "Description            : " + description + "\n" +
			           "Category               : " + category + "\n" +
			           "Price                  : $" + String.format("%.2f", price) + "\n" +
			           "Discount Percentage    : " + String.format("%.2f", discountPercentage) + "%\n" +
			           "Rating                 : " + String.format("%.1f", rating) + " / 5.0\n" +
			           "Stock                  : " + stock + " units\n" +
			           "Brand                  : " + brand + "\n" +
			           "SKU                    : " + sku + "\n" +
			           "Weight                 : " + String.format("%.2f", weight) + " kg\n" +
			           "Warranty Information   : " + warrantyInformation + "\n" +
			           "Shipping Information   : " + shippingInformation + "\n" +
			           "Availability Status    : " + availabilityStatus + "\n" +
			           "Return Policy          : " + returnPolicy + "\n" +
			           "Minimum Order Quantity : " + minimumOrderQuantity + "\n" +
			           "Thumbnail URL          : " + thumbnail + "\n" +
			           "-------------------------------------------";
		   }

	}


