package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		String[] itemNames = new String[5];
		String[] inputPrice = new String[5];
		int[] itemPrice = new int[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {

			System.out.println("商品" + (i + 1) + "を入力してください。：＞");
			itemNames[i] = reader.readLine();
		}
		System.out.println("各商品の単価を順に入力してください");
		for (int i = 0; i < 5; i++) {

			System.out.println(itemNames[i] + "の単価：＞");
			inputPrice[i] = reader.readLine();
			itemPrice[i] = Integer.parseInt(inputPrice[i]);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":" + itemPrice[i] + "円");

		}
	}
}
