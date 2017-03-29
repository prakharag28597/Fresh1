package prakash.fresh1;




public class Info {
    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String[] progNames = new String[26] ;
    public int[] quantity = new int[26];
    public int[] prices = new int[26];

    void NamingFn()
    {
        for(int i=0;i<26;++i)
        {
            progNames[i] = Character.toString(alphabet[i]);
            quantity[i] = 0 ;
            prices[i] = (int)(Math.random()*100+1) ;
        }
    }
}
