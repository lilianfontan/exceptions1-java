package entities4;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public final String priceTag() {
		return name 
				+ " $ "
				+ String.format("%.2f", price + customsFee)
				+ " (Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}
