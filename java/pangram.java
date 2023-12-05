class pangram {
    public static boolean pangram_check(String str){
        boolean flag = true;
        int [] alpha = new int[26];
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                alpha[(str.charAt(i)-97)]++;
                }
                else if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                    alpha[(str.charAt(i)-65)]++;
                }
            }
            for(int j=0;j<alpha.length;j++){
                if(alpha[j]==0){
                    flag = false;
                    break;
                }
            }
            return flag;
            }       
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(pangram_check(str));
    }
}
