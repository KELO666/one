package prac;

/**
 * @author KELO
 * @date 2019/6/4 - 18:37
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 */
public class Power {
    public double Power(double base, int exponent) {
        if(exponent==0 && base != 0)
            return 1;
        if(exponent==1)
            return base;
        if(base == 0 && exponent <= 0){
            throw new RuntimeException();
        }
        if(base ==0 && exponent>0){
            return 0;
        }
        double result = 1;
        for (int i=0;i<Math.abs(exponent);i++){
            result*=base;
        }
        if (exponent<0){
            result = 1/result;
        }
        return result;
    }
}
