package homework01;

public class Homework02 {
	
	public static void main(String[]args) {
		
		// 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
//		int sum = 0;
//		for (int i = 2; i <= 1000; i +=2)
//			sum += i ;
//			
//			System.out.println(" 1~1000的偶數和 " + sum );

		
		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
//		int sum = 1;
//		for (int i = 1; i <= 10; i ++)
//			sum *= i;
//			System.out.println(" 1~10的連乘積 = " + sum );

		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
//		int sum = 1, i = 1;
//		while (i <= 10){
//			
//			sum *= i;
//			i++;
//		}	
//			System.out.println(" 1~10的連乘積 " + sum);

		//  請設計一隻Java程式，輸出結果為以下：
//		    1 4 9 16 25 36 49 64 81 100
//		for (int i = 1; i<= 10; i++) {
//				System.out.print( i * i + " ");
//		}

		// 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		   輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
//		int count = 0;
//		
//		System.out.println("阿文可以選擇的數字有:");
//		
//		for (int i = 1; i <= 49; i++) {
//			if (i % 10 != 4 && i / 10 != 4) {   // i%10檢查個位數!=4，i/10檢查十位數!=4
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		
//		System.out.println(" 總共有 " + count + " 個數字可以選擇 ");
//		
		
		//  請設計一隻Java程式，輸出結果為以下：
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6 
//			1 2 3 4 5
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1
//		for (int i = 10; i >= 1; i-- ){
//			for (int j =1; j <= i; j++ )
//				System.out.print(j +" ");
//			System.out.println();
//		}


		// 請設計一隻Java程式，輸出結果為以下：
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
//		for (int i = 1; i <= 6; i++) { // 外層迴圈控制行數
//            char letter = (char) ('A' + i - 1 ); // 計算對應的字母
//            for (int j = 1; j <= i; j++) { // 內層迴圈控制字母的重複次數
//                System.out.print(letter); // 打印字母
//            }
//            System.out.println(); // 換行
//        }
	}
}

