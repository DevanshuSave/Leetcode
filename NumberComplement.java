import java.util.ArrayList;
import java.util.List;

public class NumberComplement {
	public static void main(String args[]) {
		System.out.println(findComplement(5));
	}
	
    public static int findComplement(int num) {
    	List<Integer> bits = decimalToBinary(num);
        for(int i=0;i<bits.size();i++){
        	bits.set(i,(bits.get(i)+1)%2);
        }
        System.out.println("complement bits"+bits);
        return binaryToDecimal(bits);
    }
    
    public static List<Integer> decimalToBinary(int num){
    	List<Integer> bits = new ArrayList<Integer>();
        while(num>0){
        	if(num%2==1) {
        		num--;
        		bits.add(1);
        	}
        	else {
        		bits.add(0);
        	}
        	num=num/2;
        }
        System.out.println(bits.toString());
        return bits;
    }
    
    public static int binaryToDecimal (List<Integer> bits){
        int num=0;
        for(int i=0;i<bits.size();i++) {
        	num+=bits.get(i)*Math.pow(2,i);
        }
        return num;
    }
    
    
    
    /*Fastest solution I came up with (Time: 11ms)
     public int findComplement(int num) {
        int complement=0;
        int i=0;
        while(num>0){
            complement+=(num+1)%2*Math.pow(2,i++);
            num=num/2;
        }
        return complement;
    }
     */
}
