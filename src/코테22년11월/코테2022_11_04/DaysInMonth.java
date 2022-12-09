package 코테22년11월.코테2022_11_04;

public class DaysInMonth {
    public int DaysInMonth(int month) {
    // TODO:
    int result = 0;
    switch (month) {
        case 1 :
            result = 31;
            break;
        case 2 :
            result = 28;
            break;
        case 3 :
            result = 31;
            break;
        case 4 :
            result = 30;
            break;
        case 5 :
            result = 31;
            break;
        case 6 :
            result = 30;
            break;
        case 7 :
            result = 31;
            break;
        case 8 :
            result = 31;
            break;
        case 9 :
            result = 30;
            break;
        case 10 :
            result = 31;
            break;
        case 11 :
            result = 30;
            break;
        case 12 :
            result = 31;
            break;
    }
     return result;
     /* switch (month) {
       case 2: return 28;
       case 4:
       case 6:
       case 9:
       case 11: return 30;
       default: return 31; */
}
	}



