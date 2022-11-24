package yoo;

import java.util.Arrays;

import javax.management.ValueExp;

public class StringStudy {

	public static void main(String[] args) {

		// #1. StringŬ������ ��ü���� �� ���� �Ұ��� -> ���ο� ��ü ���� �� ����

		String str1 = new String("�ȳ�");
		String str2 = str1;

		str1 = "�ȳ��ϼ���";
		System.out.println(str1);
		System.out.println(str2);

		// #2. ���ͷ��� �ٷ� �Է��� ��쿡�� ���ڿ��� ���� ��� �ϳ��� ��ü�� ���� �� �� �ִ�

		String str3 = "�ȳ�";
		String str4 = "�ȳ�";
		System.out.println(str3 == str4);

		// String.valueOf (�⺻�ڷ���) => �⺻�ڷ����� String���� ��ȯ
		String str5 = "�ȳ�" + String.valueOf("!");
		System.out.println(str5);

		System.out.println();

		String str6 = "Hello Java!";
		System.out.println(str6.indexOf('a')); // 7��°
		System.out.println(str6.indexOf("Java")); // 6��°
		System.out.println(str6.lastIndexOf('H')); //
		System.out.println();

		// String�� �ֿ� �޼���
		// ���ڿ� ���� ( toUpperCase() , toLowerCase(),
		String str10 = "Java Study";
		System.out.println(str10.toUpperCase()); // JAVA STUDY
		System.out.println(str10.toLowerCase()); // java study

		// replace
		System.out.println(str10.replace("Study", "����")); // Java ����

		// substring
		System.out.println(str10.substring(0, 5)); // 0���� 5���� Java

		// split
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray)); // / - ���� ���� �� ����

		// trim
		System.out.println("    abc    ".trim());

		// ���ڿ� ����� ( equals(),equalsIgnoreCase( ��ҹ��� ���� X ) )
		String str11 = new String("java");
		String str12 = new String("java");
		System.out.println(str11.equals(str12));
		System.out.println(str11.equalsIgnoreCase(str12));

	}
}
