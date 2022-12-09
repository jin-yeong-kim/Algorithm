package 코테22년11월.코테2022_11_04;

public class or {
    public boolean or(boolean expression1, boolean expression2) {
        // TODO:
        if(expression1 == !expression2 && !expression1 == expression2){
            return true;
        } else if(expression1 == expression2){
            if(expression2 == true){
                return true;
            } else return false;
        } else return false;
    }
}
