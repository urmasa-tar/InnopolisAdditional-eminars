class Test{
    public static void main(String[] args){
        System.out.println("Hello world" + "\nFor now local sum is " + localSum(1, 2));
    }

    protected void tester(){

    }

    private static int localSum(int n, int m){
        int res = 0;

        res = n + m;

        return res;
    }
}



