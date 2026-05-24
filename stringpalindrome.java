public class stringpalindrome {
    public static void main(String args[]){
        String str="ANNA";
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
            isPalindrome=false;
            break;
        }
        left++;
        right--;
    }
    if(isPalindrome){
        System.out.println("palindrome");
    }else{
        System.out.println("not palindrome");
    }

}

}