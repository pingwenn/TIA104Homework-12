package homework01;

import java.util.Scanner;

public class homework04 {
	
//	• 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
//	public static void main(String[] args) {
////		 初始化一維陣列
//        int array[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}; // 定義一個整數陣列並初始化元素
//
//        // 計算總和
//        int sum = 0; // 定義一個整數變數 sum，初始值為 0
//        for (int num : array) { // 因為元素不變，所以使用增強型 for 迴圈遍歷陣列中的每個元素，避免Bug
//            sum += num; // 將每個元素加到 sum 中
//        }
//
//        // 計算平均值
//        double average = (double) sum / array.length; // 計算平均值，將 sum 轉為 double 
//
//        // 輸出平均值
//        System.out.println("平均值: " + average); //  輸出計算出的平均值
//
//        // 輸出大於平均值的元素
//        System.out.println("大於平均值的元素:"); // 列出大於平均值的元素
//        for (int num : array) { // 使用增強型 for 迴圈，處理迴圈內的每個元素
//            if (num > average) { // 如果當前元素大於平均值
//                System.out.println(num); // 輸出該元素
//            }
//        }
//	}
//}
//		
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)	
//public static void main(String[] args) {
//		String s = "Hello World";
//		String reversed = new StringBuilder(s).reverse().toString();
//		System.out.println(reversed); 
//	}
//}
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
//	public static void main(String[] args) {
//		String planets[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranis", "neptune" };
//		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
//
//		int count = 0;
//		for (int i = 0; i < planets.length; i++) {
//			for (int j = 0; j < planets[i].length(); j++) {
//				char currentChar = planets[i].charAt(j);
//
//				// 檢查當前字元是否為母音
//				for (int k = 0; k < vowels.length; k++) { // 遍歷母音陣列
//					if (currentChar == vowels[k]) { // 如果找到匹配的母音
//						count++; // 計數器加1
//						break; // 找到就可以跳出最內層迴圈了
//					}
//				}
//			}
//		}
//		System.out.println("總共有 " + count + " 個母音");
//	}
//}
//
//
//	• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
//	(提示:Scanner,二維陣列)
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//			System.out.println("輸入欲借金額");
//		int money = scanner.nextInt();
//		
//		int employees[][] = {
//				{25, 2500},
//				{32, 800},
//				{8, 500},
//				{19, 1000},
//				{27, 1200}
//		};
//		
//		System.out.print("有錢可借的員工編號:" );
//		int count = 0; // 紀錄可借人數
//		
//		for (int i = 0; i < employees.length; i++) {
//				if (employees[i][1] >= money) {  // 比較現金欄位
//					System.out.print(employees[i][0] + " "); // 輸出編號
//					count++;
//				}
//			}
//		System.out.println("共" + count + "人");
//		
//		scanner.close();
//		}
//	}
	
	
	
//
//	• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	
//	public static void main (String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		 // 定義每月的天數
//        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        // 輸入年份、月份和日期
//        System.out.print("請輸入年份 (yyyy): ");
//        int year = scanner.nextInt();
//
//        System.out.print("請輸入月份 (1-12): ");
//        int month = scanner.nextInt();
//
//        System.out.print("請輸入日期 (1-31): ");
//        int day = scanner.nextInt();
//
//        // 驗證輸入是否合法
//        if (month < 1 || month > 12) {
//            System.out.println("月份無效，必須在 1 到 12 之間！");
//            return;
//        }
//
//        // 判斷是否為閏年
//        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        if (isLeapYear) {
//            daysInMonth[1] = 29; // 閏年 2 月有 29 天
//        }
//
//        // 檢查日期是否合理
//        if (day < 1 || day > daysInMonth[month - 1]) {
//            System.out.println("日期無效！" + month + " 月最多只有 " + daysInMonth[month - 1] + " 天！");
//            return;
//        }
//
//        // 計算是該年的第幾天
//        int dayOfYear = 0;
//        for (int i = 0; i < month - 1; i++) {
//            dayOfYear += daysInMonth[i]; // 累加前幾個月的天數
//        }
//        dayOfYear += day; // 加上當月的天數
//
//        // 輸出結果
//        System.out.println("輸入的日期為該年第 " + dayOfYear + " 天。");
//        scanner.close();
//    }
//}
//
//
//	• 班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數
//	(提示:二維陣列)
	public static void main(String[] args) {
		
		int classmate[][] = {
				{10, 37, 100, 77, 98, 90},
				{35, 75, 70, 95, 70, 80},
				{40, 77, 79, 70, 89, 100},
				{100, 89, 90, 89, 90, 75},
				{90, 64, 75, 60, 75, 50},
				{85, 75, 70, 75, 90, 20},
				{75, 70, 79, 85, 89, 99},
				{70, 95, 90, 89, 90, 75}
		};
		
		for(int i = 0; i < classmate.length; i ++) {
			int rowMax = classmate[i][0];
			
			for( int j = 1; j < classmate[i].length; j++ ) {
				if(classmate[i][j] > rowMax ) {
					rowMax = classmate[i][j];
				}
			}
			System.out.println("第 " + (i + 1) + "位同學的最高分數是 " + rowMax);
		}
	}
}



