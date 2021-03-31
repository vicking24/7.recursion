class gcd{
    public static void main (String[]args){
        System.out.println(gcd.reduce(252, 105));

    }
    public static int reduce (int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==b) return a;
        if (a>b){ 
            return reduce(a-b, b);
        } else {
            return reduce(a, b-a);
        }

    }

}