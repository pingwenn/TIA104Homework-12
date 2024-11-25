package homework01;

import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
//	(提示:Scanner,三角形成立條件,判斷式if else)
//	(進階功能:加入直角三角形的判斷)
//
//		Scanner scanner = new Scanner(System.in); // 創建 Scanner 物件以讀取輸入
//        System.out.println("請輸入三個整數："); // 提示使用者輸入三個邊長
//        
//        int a = scanner.nextInt(); // 讀取第一個邊長
//        int b = scanner.nextInt(); // 讀取第二個邊長
//        int c = scanner.nextInt(); // 讀取第三個邊長
//
//        // 檢查三個邊是否能構成三角形
//        if (!isTriangle(a, b, c)) {
//            System.out.println("這不是三角形"); // 如果不能構成三角形，則輸出提示
//        } else {
//            // 如果能構成三角形，判斷並輸出三角形類型
//            System.out.println(getTriangleType(a, b, c));
//        }
//
//        scanner.close(); // 關閉 Scanner，釋放資源
//    }
//
//    // 檢查三邊是否滿足三角形不等式
//    private static boolean isTriangle(int a, int b, int c) {
//        return (a + b > c) && (a + c > b) && (b + c > a); // 檢查是否滿足所有三角形不等式
//    }
//
//    // 根據邊長判斷三角形的類型
//    private static String getTriangleType(int a, int b, int c) {
//        if (a == b && b == c) {
//            return "正三角形"; // 三邊相等，返回正三角形
//        } else if (a == b || b == c || a == c) {
//            return "等腰三角形"; // 兩邊相等，返回等腰三角形
//        } else if (isRightTriangle(a, b, c)) {
//            return "直角三角形"; // 判斷是否為直角三角形
//        } else {
//            return "其它三角形"; // 如果以上條件都不滿足，則返回其它三角形
//        }
//    }
//
//    // 檢查是否為直角三角形
//    private static boolean isRightTriangle(int a, int b, int c) {
//        return (a * a + b * b == c * c) || // 檢查 a 和 b 是否為直角邊
//               (a * a + c * c == b * b) || // 檢查 a 和 c 是否為直角邊
//               (b * b + c * c == a * a);   // 檢查 b 和 c 是否為直角邊

//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
//  (提示:Scanner,亂數方法,無窮迴圈)
//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
//		int i;
//		i = (int) (Math.random() * 100);  //  0 到 100 的隨機數字
//		Scanner sc = new Scanner(System.in); // 在迴圈外創建 Scanner
//		
//		while (true) {
//			System.out.println("輸入你猜的數字！(0~100)"); // 提示使用者輸入
//		int a = sc.nextInt();  // 讀取使用者的猜測
//		
//		// 檢查輸入是否有效
//		if( a < 0 || a > 100) {
//			System.out.println("請輸入有效的數字");
//			continue; // 重新開始迴圈
//		}
//		
//		// 判斷猜測結果
//		if( a == i){
//			System.out.println("猜對了!!!! 數字是 " + a);
//			break; // 猜對了，跳出迴圈
//		}else if( a > i){
//			System.out.println("提示:比" + a + "小"); // 判斷a大於數字
//		}else if( a < i) {
//			System.out.println("提示:比" + a + "大"); // 判斷a小於數字
//		}else {
//			System.out.println("猜錯了，再一次 "); // 提示使用者再試一次	
//			}
//		}
//		sc.close(); // 關閉 Scanner
//		

//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:
//	(提示:Scanner)
//	(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入不想要的數字(1~9)");

		// 使用者輸入
		int userNumber = sc.nextInt();

		// 判斷輸入的數字1~9
		if (userNumber < 1 || userNumber > 9) {
			System.out.println("請輸入1~9的數字");
		} else {
			int count = 0; // 計數器初始化

			// 顯示可以選擇的號碼
			System.out.println("可以選擇的數字");
			for (int i = 1; i <= 49; i++) {
				if (i % 10 != userNumber && i / 10 != userNumber) { // 排除不要的數字
					System.out.print(i + " ");
					count++;
				}
			}
			System.out.println(" \n總共有 " + count + " 個數字可以選擇 ");
			
			// 直接亂數印出6個號碼且不得重複
			
			
		}
		sc.close();

	}
}
