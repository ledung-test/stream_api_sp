package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
//		List<Integer> numbers = List.of(10, 5, 3, 12, 6, 7, 5, 3);
////		0.Duyệt numbers
//		numbers.forEach(number -> System.out.println(number));
////		1.Tìm các giá trị chẵn trong list
//		numbers.stream().filter(number -> number % 2 == 0)
//						.forEach(number -> System.out.println(number));
////		2.Tìm các giá trị > 5 trong list
//		numbers.stream().filter(number -> number > 5)
//						.forEach(number -> System.out.println(number));
////		3.Tìm giá trị max trong list
//		Integer max = numbers.stream().max((o1, o2) -> o1 - o2).orElse(null);
//		System.out.println(max);
////		4.Tìm giá trị min trong list
//		Integer min = numbers.stream().min((o1, o2) -> o1 - o2).orElse(null);
//		System.out.println(min);
////		5.Tính tổng các phần tử của mảng
//		int total = numbers.stream().reduce(0, (sum, number) -> sum + number);
//		System.out.println(total);
////		6.Lấy danh sách các phần tử không trùng nhau
//		System.out.println(numbers.stream().distinct().toList());
////		7.Lấy 5 phần tử đầu tiên trong mảng
//		System.out.println(numbers.stream().limit(5).toList());
////		8.Lấy phần tử từ thứ 3 -> thứ 5
//		System.out.println(numbers.stream().skip(3).limit(2).toList());
////		9.Lấy phần tử đầu tiên > 5
//		System.out.println(numbers.stream().filter(number -> number > 5).findFirst().stream().toList());
////		10.Kiểm tra xem list có phải là list chẵn hay không
//		System.out.println(numbers.stream().allMatch(number -> number % 2 == 0));
////		11.Kiểm tra xem list có phần tử > 10 hay không
//		System.out.println(numbers.stream().anyMatch(number -> number > 10));
////		12.Có bao nhiêu phần tử > 5
//		System.out.println(numbers.stream().filter(number -> number > 5).count());
////		13.Nhân đôi các phần tủ trong list và trả về list mới
//		System.out.println(numbers.stream().map(number -> number * 2).toList());
////		14.Kiểm tra xem list không chứa giá trị nào = 8 hay không
//		System.out.println(numbers.stream().noneMatch(number -> number == 8));
	}
}
