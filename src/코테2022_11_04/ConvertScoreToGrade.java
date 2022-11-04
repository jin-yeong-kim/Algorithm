package 코테2022_11_04;

public class ConvertScoreToGrade {
    public char convertScoreToGrade(int score) {
        // TODO:
        if(score > 100 || score < 0){
            return 'X';
        }
        else if(score <= 100 && score >= 90){
            return 'A';
        }
        else if(score <= 89 && score >= 80){
            return 'B';
        }
        else if(score <= 79 && score >= 70){
            return 'C';
        }
        else if(score <= 69 && score >= 60){
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
