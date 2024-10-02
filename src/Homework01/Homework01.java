package Homework01;

public class Homework01 {
	
	public static void main(String[] args) {
		
		// 1-1 計算12,6這兩個數值的和與積
//		int num1 = 6, num2 = 12;
//		int sum = num1 + num2;
//		int product = num1 * num2;
//		
//		System.out.println(" 6+12 = " + sum);
//		System.out.println(" 6*12 = " + product);
		
		// 1-2 計算200顆蛋共是幾打幾顆?(一打12顆)
//		int egg = 200, dozen = 12;
//		int total = egg / dozen;
//		int remainder = egg % dozen;
//		
//		System.out.println(" 200顆蛋總共是 " + total + '打' + remainder + '顆');
		
		// **1-3 算出256559秒為多少天、多少小時、多少分與多少秒
//		int totalSecond = 256559,  days = 60 * 60 * 24, hours = 60 * 60, minutes = 60;
//		int day = totalSecond / days;
//			totalSecond %= days;
//		int hour = totalSecond / hours;
//			totalSecond %= hours;
//		int minute = totalSecond / minutes;
//			totalSecond %= minutes;
//			
//			System.out.println( "256559秒為" + day + "天" + hour + "小時" + minute + "分" + totalSecond + "秒");
		
	
		// 1-4 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//		double p = 3.1425;
//		int pi = 5;
//		double area = pi * pi * p;
//		double cirp = pi * 2 * p;
//		
//		System.out.println(" 圓面積 = " + area);
//		System.out.println(" 圓周長 = " + cirp);
	
		
		// 1-5某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
        // 金加利息共有多少錢? 複利計算公式:複利計算公式：本利和 = 本金 × (1 + 年利率)^期間
//		double principal = 1500000;
//		double interestRate = 0.02;		// 年利率2%
		
//		for (int i = 0; i < 10; i++) {
//			principal += principal * interestRate;
//		}
		
		
		
		// 1-6 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		// 5 + 5
		// 5 + ‘5'
		// 5 + “5”
		// 並請用註解各別說明答案的產生原因
//		System.out.println( 5 + 5 );    //  兩個整數相加
//		System.out.println( 5 + '5' );  //  '5'是字元,轉換成對應的ASCII值是53,所以5+53=58
//		System.out.println( 5 + "5" );  //  "5"是字串,5跟字串"5"串接之後,結果為55
	}
	
		
		
}
