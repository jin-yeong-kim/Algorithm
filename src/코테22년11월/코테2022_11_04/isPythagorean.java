package 코테22년11월.코테2022_11_04;

public class isPythagorean {
    public boolean isPythagorean(int side1, int side2, int side3) {
        // TODO:
        if(side2 * side2 + side1 * side1 == side3 * side3){
            return true;
        } else if(side2 * side2 + side3 * side3 == side1 * side1){
            return true;
        } else if(side3 * side3 + side1 * side1 == side2 * side2){
            return true;
        } else return false;
    }
}
