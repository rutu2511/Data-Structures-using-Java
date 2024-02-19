public class searchInString {
    public static void main(String[] args) {
        String str="kunal";
        char ch='o';
        System.out.println(linear(str,ch));
    }
    static boolean linear(String str, char c){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
