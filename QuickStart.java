//Java recap by andrerms
class QuickStart{
    public static void main(String[] args){
        // System.out.println("Here I go again!");
        int count = 10;
        for(int i=0; i<count; i++){
            String str = "";
            for(int j=0; j<i+1; j++){
                str = str + "*";
            }
            System.out.println(str);
        }
    }
}