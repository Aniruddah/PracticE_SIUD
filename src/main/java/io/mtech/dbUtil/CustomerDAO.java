package io.mtech.dbUtil;


	
	public interface CustomerDAO {
		
		public boolean addCustomer(Customer e);
		public boolean deleteCustomer(int id);
		public boolean updateCustomer(Customer e);
		public boolean showCustomer(int id);
		public boolean showAllEmploies();
		public boolean findMaxSalary();
		public boolean findMinSalary();
		
		public boolean findSecondMaxSalary();
		
			

	}

