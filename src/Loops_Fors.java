// refer : https://www.w3schools.com/java/java_for_loop.asp
public class Loops_Fors {
    public static void main(String[] args) {
        /*
            for 동작 위한 조건 : 시작점, 반복횟수, 종료조건
            statment 1 : 시작점
            statment 2 : 종료 조건
            statment 3 : 반복 횟수
        for (statment 1 ; statment 2 ; statment 3){
        }   
        */

        /*
         예제 1 부터 5까지 1씩증가하며 출력하는것
        */

        for(int count = 1 ; count <= 5 ; count++){
            System.out.println("For count : " + count);
        }

        System.out.println("Hello World!");
       // return 0; 
    }
}