import java.util.*;


public class Walking {
    public static void main(String[] args) {
			try{
				String message = "※今日歩いた距離を入力してください。※";
				System.out.println(message);
        Scanner sc = new Scanner(System.in);
        //標準入力を発生、整数を入力
        int WalkingDistance = sc.nextInt();
        //入力された数値によって、出力を条件分岐させる
        if(WalkingDistance < 3000){
					System.out.println("※1日の平均歩数の平均以下の距離になります。少しずつ歩く距離を増やして行きましょう。※");
        } else if (WalkingDistance > 3001 && WalkingDistance < 6000){
					System.out.println("※1日の平均歩数より少し足りていないですね。5分から10分目安で、歩く距離を増やして行きましょう。※");
        } else if (WalkingDistance < 6001 && WalkingDistance > 10000){
					System.out.println("※1日の平均歩数から十分歩けています。このまま継続して、健康的に歩いて行きましょう。※");
				} else {
					System.out.println("※かなり歩かれています。怪我に気を付けながら歩いて行きましょう。※");
				}
			} catch(Exception e) {
				System.out.println("※小数点なしの整数で、入力をお願いします。※");
				main(args);
			}
    }
}
