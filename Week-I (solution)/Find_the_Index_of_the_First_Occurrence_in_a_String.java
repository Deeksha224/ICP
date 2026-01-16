public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        int i = 0;
        for (int j = needle.length(); j <= haystack.length(); j++){
            if (haystack.substring(i,j).equals(needle)){
                return i;
            }
            i++;
        }
        return -1;
    }
}
