package com.edu.bvks.certs;

public class Test1 {

	public static void main(String[] args) {
		// 1
		// byte b1 = (byte) (127 + 21);
		// System.out.println(b1); // -108

		// 2
		// char c = 'Z';
		// long l = 100_00l;
		// int i = 9_2;
		// float f = 2.02f;
		// double d = 10_0.35d;
		// l = c + i;
		// f = c * l * i * f;
		// f = l + i + c;
		// // i = d; //Type mismatch: cannot convert from double to int
		// // f = d; // Type mismatch: cannot convert from double to float
		// i = (int) d;
		// f = (long) d;
		// // All the above code work here

		// 3
		// char c1 = 'a'; // ASCII code of 'a' is 97
		// int i1 = c1; // Line n1
		// System.out.println(i1); // Line n2 - 97

		// 4
		// int x = 5____0;
		// // int y = ____50; // The commented statements are illegal
		// // int z = 50____;
		// float f1 = 123.76_86f;
		// double d1 = 1_2_3_4;

		// 5
		// byte b1 = 10; // Line n1
		// int i1 = b1; // Line n2
		// byte b2 = i1; // Line n3 - Type mismatch: cannot convert from int to byte
		// System.out.println(b1 + i1 + b2);

		// 6
		// short s1 = 10;
		//
		// final int i3 = 10;
		// short s3 = i3;
		//
		// final int i5 = 10;
		// short s5 = i5 + 100;
		// All aboe are valid stmts

		// 7
		// boolean b1 = 0;
		// boolean b2 = 1;
		// System.out.println(b1 + b2); // booleans only acccept true/false

		// 8
		// Boolean b1 = Boolean.valueOf("tRuE");
		// Boolean b2 = Boolean.valueOf("fAlSe");
		// Boolean b3 = Boolean.valueOf("abc");
		// Boolean b4 = null;
		// System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4); // true false false
		// null

		// 11
		// extractInt(2.7);
		// extractInt(2.7d);
		// extractInt(2.);
		// extractInt(2);// comp error
		// extractInt(2.3f);// comp error
		// extractInt(2l);// comp error

		// 12
		// String[] arr = { "abc", "TrUe", "false", null, "FALSE" };
		// for (String s : arr) {
		// System.out.print(Boolean.valueOf(s) ? "T" : "F");
		// } // FTFFF

		// 13
		// System.out.println(53 / 2.0);
		// System.out.println(53 % 2.0); // 26.5, 1.0

		// 14
		// System.out.println("Password" + 1 + 2 + 3 + 4); - Password1234

		// 15
		// System.out.println(1 + 2 + 3 + 4 + "Running"); - 10Running

		// 16
		// System.out.println("1" + "2" + "3" == "1" + "2" + "3"); - true
		// System.out.println("1" + "2" + "3" == new String("1" + "2" + "3"));// - false

		// 17
		// System.out.println("Equals??? " + 10 != 5); - Incompatible operand types
		// String and int

		// 18
		// System.out.println("Result is: " + (10 != 5)); - true

		// 19
		// byte var = 127;
		// var = var + 0.0;
		// var+=110;
		// System.out.println(var = var - 1);gives error
		// System.out.println(var = var + 1);gives error
		// System.out.println(++var);
		// System.out.println(--var);
		// System.out.println(var *= 2);
		// System.out.println(var -= 10);
		// System.out.println(var += 2);
		// System.out.println(var);

		// 20
		// such that nullnullnull is printed on to the console

		// String text = null;
		// System.out.println(text.repeat(3)); // Throws NPE
		// System.out.println(null + null + null); //The operator + is undefined for the
		// argument type(s) null, null
		// System.out.println(null + "null" + null);
		// System.out.println(text *= 3); // The operator *= is undefined for the
		// argument type(s) String, int
		// System.out.println(text += "null".repeat(2));
		// System.out.println(text + text + text);
		// text += null; System.out.println((text.concat(null)));

		// 21
		// String text = null;
		// System.out.println( new A() + " " + text);
		// text = text + new A(); // Line n1
		// System.out.println(text.length() + " " + text); // Line n2

		// 22
		// String text = "RISE ";
		// text = text + (text = "ABOVE ");
		// System.out.println(text); // RISE ABOVE

		// 23
		// StringBuilder sb = new StringBuilder("INHALE ");
		// String s = sb.toString() + (sb.append("EXHALE "));
		// System.out.println(s.strip().length()); // 20

		// 24
		// boolean flag = false;
		// System.out.println((flag = true) | (flag = false) || (flag = true));
		// System.out.println(flag); // No Idea - true, false

		// 25
		// boolean status = true;
		// System.out.println(status = false || status = true | status = false);
		// System.out.println(status); // The left-hand side of an assignment must be a
		// variable - No Idea

		// 26
		// int a = 3; // Line n1
		// int b = 5; // Line n2
		// int c = 7; // Line n3
		// int d = 9; // Line n4
		// boolean res = --a + --b < 1 && c++ + d++ > 1;
		// System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b", a, b, c, d,
		// res); // Short Circuit
		// a = 2, b = 4, c = 7, d = 9, res = false

		// 27
		// int m = 20;
		// int var = --m * m++ + m-- - --m;
		// System.out.println("m = " + m);
		// System.out.println("var = " + var);
		// m = 18
		// var = 363

		// 28
		// int x = 7;
		// boolean res = x++ == 7 && ++x == 9 || x++ == 9;
		// System.out.println("x = " + x);
		// System.out.println("res = " + res);

		// 29
		// int a = 1000;
		// System.out.println(-a++);

		// 30
		// int i = 2;
		// boolean res = false;
		// res = i++ == 2 || --i == 2 && --i == 2;
		// System.out.println(i);

		// 31
		// int i = 10;
		// System.out.println(i > 3 != false);

		// 32
		// boolean flag1 = true;
		// boolean flag2 = false;
		// boolean flag3 = true;
		// boolean flag4 = false;
		//
		// System.out.println(!flag1 == flag2 != flag3 == !flag4); // Line n1
		// System.out.println(flag1 = flag2 != flag3 == !flag4); // Line n2
		// // false, true

	}

	private static void extractInt(Double obj) {
		System.out.println(obj.intValue());
	}

}

class A {
	public String toString() {
		return null;
	}
}
