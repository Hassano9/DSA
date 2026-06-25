public class IsSubsequenceBruteForce {

    public boolean isSubsequence(String s, String t) {
        //if s is empty return true
        if(s.equals("")){
            return true;
        }
        //i created 2 arrays to make it easier to read

        int start=0;
        int count=0;
        boolean found=false;
        //if s is not in t return false
        //if s is in t return true

        for(int i=0;i<s.length();i++){
            for(int j=start;j<t.length();j++){
                count=i;
                if(s.charAt(i)==t.charAt(j)){
                    start=j+1;
                    found=true;
                    break;
                }
                else{
                    found= false;
                }

            }
            if(found==false){
                break;
            }
        }
        if(count!=s.length()-1){
            found=false;
        }
        return found;
    }
    public static void main(String[] args) {
        IsSubsequenceBruteForce is=new IsSubsequenceBruteForce();
        System.out.println(is.isSubsequence("aec","abcde"));
    }
}
/**
 * Time Complexity: O(N + M), where N is the length of string 's' and M is
 * the length of string 't'. Because 't' can be much larger than 's' according
 * to the problem constraints, this is often just referred to as O(M).
 * * Space Complexity: O(1) constant space, as we look up characters directly
 * from the strings without creating any extra arrays.
 */