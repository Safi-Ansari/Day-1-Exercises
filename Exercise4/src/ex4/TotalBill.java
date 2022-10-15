package ex4;

import java.util.Date;

public class TotalBill {
	
	class Customer{
			String name;
			boolean member=false;
			String memberType;
			
			public Customer(String name) {
				this.name = name;
			}
			String getName() {
				return name;
			}
			boolean isMember() {
				
			}
			void setMember(boolean member) {
				this.member = member;
			}
			String getMemberType(){
				
			}
			void setMemberType(String type) {
				
			}
		}
		
		class Visit{
			Customer customer;
			Date date;
			double serviceExpense;
			double productExpense;
			private String name;
			
			public Visit(String name, Date date) {
				this.name = name;
				this.date = date;
			}
			String getName() {
				return name;
			}
			double getServiceExpense() {
				
			}
			void setServiceExpense(double ex) {
				
			}
			double getProductExpense() {
				
			}
			void setServiceExpense(double ex) {
				
			}
			double getTotalExpense(){
				
			}
			
		}
		
		class Discount {
			double serviceDiscountPremium = 0.2;
			double serviceDiscountGold = 0.15;
			double serviceDiscountSilver = 0.1;
			double productDiscountPremium = 0.1;
			double productDiscountGold = 0.1;
			double prductDiscountSilver = 0.1;
			double getServiceDiscountRate() {
				
			}
			double getProductDiscountRate() {
				
			}
			
		}


}
