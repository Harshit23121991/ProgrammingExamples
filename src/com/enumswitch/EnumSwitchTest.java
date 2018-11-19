package com.enumswitch;

import java.util.ArrayList;
import java.util.List;

public class EnumSwitchTest {

	public static void main(String[] args) {
		
		List<Company> l = new ArrayList<>();
		l.add(new Company("abc", RtAdditionaInfoType.Campaign));
		l.add(new Company("abc1", RtAdditionaInfoType.Channel));
		l.add(new Company("abc2", RtAdditionaInfoType.ConditionGroup));
		l.add(new Company("abc3", RtAdditionaInfoType.DefaultLoanDuration));
		l.add(new Company("abc4", RtAdditionaInfoType.MktContent));
		l.add(new Company("abc5", RtAdditionaInfoType.language));
		l.add(new Company("abc5", RtAdditionaInfoType.MktCampaign));
		
		
		l.stream().forEach(company ->{
			RtAdditionaInfoType rt = company.getRtAdditionaInfoType();
		     switch(rt) {
		         case Campaign:
		            System.out.println("You choose Campaign!");
		            break;
		         case Channel:
		            System.out.println("You choose Channel!");
		            break;
		         case ConditionGroup:
		            System.out.println("You choose ConditionGroup!");
		            break;
		         case DefaultLoanDuration:
		            System.out.println("You choose DefaultLoanDuration!");
		            break;
		         case MktContent:
		            System.out.println("You choose MktContent!");
		            break;
		         case language:
			            System.out.println("You choose language!");
			            break;
		         default:
		            System.out.println("I don't know your car.");
		            break;
	      }
			
			
		});
		
		
		
		
		// TODO Auto-generated method stub

	}

}
