package 코테22년11월.코테2022_11_04;

public class ConvertScoreToGradeWithPlusAndMinus {
    public String convertScoreToGradeWithPlusAndMinus(int score) {
        // TODO:
        if(score > 100 || score < 0){
            return "INVALID SCORE";
        }
        else if(score <= 100 && score >= 90){
            if((score % 10) >= 8 || (score % 10) == 0){
                if(score == 90){
                    return "A-";
                } else
                    return "A+";
            } else if((score % 10) < 3){
                return "A-";
            } else return "A";
        }
        else if(score <= 89 && score >= 80){
            if((score % 10) >= 8 || (score % 10) == 0){
                if(score == 80){
                    return "B-";
                } else
                    return "B+";
            } else if((score % 10) < 3){
                return "B-";
            } else return "B";
        }
        else if(score <= 79 && score >= 70){
            if((score % 10) >= 8 || (score % 10) == 0){
                if(score == 70){
                    return "C-";
                } else
                    return "C+";
            } else if((score % 10) < 3){
                return "C-";
            } else return "C";
        }
        else if(score <= 69 && score >= 60){
            if((score % 10) >= 8 || (score % 10) == 0){
                if(score == 60){
                    return "D-";
                } else
                    return "D+";
            } else if((score % 10) < 3){
                return "D-";
            } else return "D";
        }
        else {
            return "F";
        }
    }
}
