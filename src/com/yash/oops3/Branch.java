package com.yash.oops3;

public class Branch {
	private int branch_id;
	   private String branch_name;
	   private String branch_address;

	   public Branch(int branch_id, String branch_name, String branch_address) {
	        super();
	        this.branch_id = branch_id;
	        this.branch_name = branch_name;
	        this.branch_address = branch_address;
	    }
	   public int getBranch_id() {
	        return branch_id;
	    }
	   public void setBranch_id(int branch_id) {
	        this.branch_id = branch_id;
	    }
	   public String getBranch_name() {
	        return branch_name;
	    }
	   public void setBranch_name(String branch_name) {
	        this.branch_name = branch_name;
	    }
        public String getBranch_address() {
	        return branch_address;
	    }

	   public void setBranch_address(String branch_address) {
	        this.branch_address = branch_address;
	    }

	   @Override
	    public String toString() {
	        return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
	                + "]";
	    }	   
}
