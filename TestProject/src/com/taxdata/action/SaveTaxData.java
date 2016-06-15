package com.taxdata.action;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.opensymphony.xwork2.ActionSupport;
public class SaveTaxData extends ActionSupport{
	
   private String name;
   private String address;
   private String pan;
   private String dob;
   private String assesment ;
   private double income;
   private double tds;
   private double taxded;
   
   private static Logger log = Logger.getLogger(SaveTaxData.class.getName());
  
   
   public String execute() throws Exception {
	  /* PropertyConfigurator.configure("TestProject\\log4j.properties");*/
	   log.info("Now the execution is in Action Class - SaveTaxData");
	   System.out.println("inside action");
	   CreateXml createobj = new CreateXml();
	   createobj.createXml(name,address,pan,dob,assesment,income,tds,taxded);
	      return "success";    
	   }	   
 
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	      System.out.println(name);
	   }
   
   public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
	}

public String getPan() {
	return pan;
}

public void setPan(String pan) {
	this.pan = pan;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getAssesment() {
	return assesment;
}

public void setAssesment(String assesment) {
	this.assesment = assesment;
}

public double getIncome() {
	return income;
}

public void setIncome(double income) {
	this.income = income;
}

public double getTds() {
	return tds;
}

public void setTds(double tds) {
	this.tds = tds;
}

public double getTaxded() {
	return taxded;
}

public void setTaxded(double taxded) {
	this.taxded = taxded;
}

public void validate()
{
   if (name == null || name.trim().equals(""))
   {
      addFieldError("name","The name is required");
   }
   if (address == null || address.trim().equals(""))
   {
      addFieldError("address","The address is required");
   }
   if (pan == null || pan.trim().equals(""))
   {
      addFieldError("pan","The pan is required");
   }
   if (dob == null || dob.trim().equals(""))
   {
      addFieldError("dob","The dob is required");
   }
   if (assesment == null || assesment.trim().equals(""))
   {
      addFieldError("assesment","The assesment is required");
   }
   if (income == 0)
   {
      addFieldError("income","The income is required");
   }
   if (tds == 0)
   {
      addFieldError("tds","The tds is required");
   }
   if (taxded == 0)
   {
      addFieldError("taxded","The taxded is required");
   }
  
}


}