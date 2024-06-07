public class Calculator {

    public <T extends Number, U extends Number> double sum(T x, T y){
        return x.doubleValue() + y.doubleValue();
    }

    public <T extends Number, U extends Number> double multiply(T x, T y){
        return x.doubleValue() * y.doubleValue();
    }

    public <T extends Number, U extends Number> double divide(T x, T y){
        return x.doubleValue() / y.doubleValue();
    }

    public <T extends Number, U extends Number> double subtract(T x, T y){
        return x.doubleValue() - y.doubleValue();
    }



}
