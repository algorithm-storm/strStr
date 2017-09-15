
public class Solution {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {

        if(source == null || target == null){
            return -1;
        }


        for(int i = 0 ; i < source.length() - target.length() + 1 ; i++) {

            int j = 0;

            for (; j < target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if (j == target.length()) {
                return i;
            }



            //wrong !
            //cannot use equal
            //because if the position of j is not equal to i
            //but the last position

/*            if (target.length() == 0 && source.length() == 0) {
                return i;
            }
            if (target.length() == 0) {
                return i;
            }

            int j = 0;

            for (; j < target.length(); j++) {

                if (source.charAt(i + j) == target.charAt(j)) {

                    if (j + 1 == target.length()) {
                        return i;
                    }
                }
            }*/


        }

        return -1;
    }

    public static void main(String[] args){

       Solution a = new Solution();
       System.out.print(a.strStr("abcdefg","efd"));
    }
}