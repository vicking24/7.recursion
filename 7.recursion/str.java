class str{
    public static void main (String[]args){
        System.out.println(str.reverse("victoria"));

    }

    public static String reverse (String word) {
        if (word.length()==0) return "";
        return word.charAt(word.length()-1)+reverse(word.substring(0,word.length()-1));

    }

}