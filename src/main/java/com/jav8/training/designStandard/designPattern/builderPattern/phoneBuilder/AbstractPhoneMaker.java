package com.jav8.training.designStandard.designPattern.builderPattern.phoneBuilder;

@SuppressWarnings("all")
public abstract class AbstractPhoneMaker {

	public interface AbstracrtMaker{
		
		public class MyPhone{
			 
			 private static final MyPhone MyPhone = null;
			 private static String versionId;
			 private static String Make;
			 private static String Os;
			 private static String Price;
			
			public static MyPhone setVersionId(String versionId) {
				 MyPhone.versionId = versionId;
				return MyPhone;
			}

			public static MyPhone setMake(String make) {
				MyPhone.Make = make;
				return MyPhone;
			}

			public static MyPhone setOs(String os) {
				MyPhone.Os = os;
				return MyPhone;
			}

			public static MyPhone setPrice(String price) {
				MyPhone.Price = price;
				return MyPhone;
			}
			public static Phone makePhone()
			{
				return new Phone( versionId,  Make,  Os,  Price);
			}
					
		}
	}

}
