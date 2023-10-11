public class Operation {

    public static float addition (float res, float num){
       res+=num;
        return(res);
    }
    public static float subtraction(float res, float num){
        res-=num;
        return(res);
    }
    public static float multiplication(float res, float num){
        res*=num;
        return(res);
    }
    public static float division(float res, float num){
        res/=num;
        return(res);
    }
    public static void equally(float res){
        if (Math.round(res)==res)
            System.out.print("Результат = " + (int)res);
        else System.out.print("Результат = " + res);
    }

}
