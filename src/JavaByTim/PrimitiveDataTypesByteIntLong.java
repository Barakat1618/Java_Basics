
public class PrimitiveDataTypesByteIntLong {

	public static void main(String[] args) {
		
		byte myByteValue = -128;
		short myShortValue = 3446;
		int myIntValue = 55;
		long myLong = (50000L  +  (10L * myByteValue + myShortValue + myIntValue));
		//Here we dont need tpo cast the value because there is no loosing of data here long accepts the int value
		short myShort = (short) (10000L  +  (10L * myByteValue + myShortValue + myIntValue));
		//There is a chance of loosing data here we need an output of type short but  
		//(10L * myByteValue + myShortValue + myIntValue) is converted to int here so we need to cast as this value
        System.out.println(" myLong = "+myLong);
        System.out.println(" myShortTotal = " + myShort);
		
	}

}
