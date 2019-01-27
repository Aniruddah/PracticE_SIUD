package io.mtech.dbUtil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Customer {

	int Customer_ID;
	String Customer_Name;
	int Customer_Salary;
	String Customer_Country;
	String Customer_City;
	
	
}
