package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message = "Name is Mandatory")
	@Size(min=3,max = 15, message = "Name should only 3 to 15 characters")
	private String name;
	
	@NotNull(message = "Price is Mandatory")
	@Positive(message = "Price should be Positive")
	private Double price;
	
	@NotNull(message = "Quantity is Mandatory")
	@Positive(message = "Quantity should be Positive")
	private Integer qty;

}
