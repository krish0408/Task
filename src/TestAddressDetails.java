import java.util.ArrayList;

public class TestAddressDetails {
	
	public static ArrayList<AddressDetails> filterAddressById(ArrayList<AddressDetails>addressList)
	{
		ArrayList<AddressDetails> arrayList = new ArrayList<AddressDetails>();
		
		for (AddressDetails addressdetails : addressList) {
			if (addressdetails.getId() > 102)
				arrayList.add(addressdetails);
				}
		return arrayList;
			
		}
	public static void main(String[] args) {
		
		ArrayList<AddressDetails> addressList =  new ArrayList<AddressDetails>();
		addressList.add(new AddressDetails(101, "8-4-6", "becon street", "Boston", 2345235));
		addressList.add(new AddressDetails(102, "6-4-7", "Harbour street", "Texas", 8561248));
		addressList.add(new AddressDetails(103, "9-4-8", "Jane street", "New Jersey", 9746123));
		addressList.add(new AddressDetails(104, "7-4-9", "Dundas street", "New York", 3746325));
		
		
		
		//for(AddressDetails address : addressList) {
		//	System.out.println(address);
		//}
		ArrayList<AddressDetails> newAddressList = filterAddressById(addressList);
		for (AddressDetails addressList1 : newAddressList) {
			System.out.println(addressList1);
			
		}
	
		
			
		}

	}


