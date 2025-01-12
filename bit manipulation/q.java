public class q {

    public static void OddorEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println(n+" is Even number");
        }else{
            System.out.println(n+" is Odd number");
        }

    }


    public static int getIthBit(int n,int i){
        int bitMask=(1<<i);
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }



    public static int setIthBit(int n,int i){
        int bitMask=(1<<i);
        return n|bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }


    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(4);
        OddorEven(480);
        OddorEven(109);

        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        
    }
}