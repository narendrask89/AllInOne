package com.java.thread.practice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileSorter {

	public static void main(String[] args) {

		Function<String, Person> mapToItem = (line) -> {
			String[] p = line.split(",");
			Person person = new Person();
			person.setName(p[0]);
			person.setAge(Integer.parseInt(p[1]));
			person.setGender(p[2]);
			return person;
		};

		List<Person> list = new ArrayList<>();

		File inputFile = new File("D:\\Test.csv");
		File outputFile = new File("D:\\Test1.csv");
		try (
				InputStream inputStream = new FileInputStream(inputFile);
				OutputStream outputStream = new FileOutputStream(outputFile);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream))
			) {

			list = bufferedReader.lines().skip(1).map(mapToItem).collect(Collectors.toList());
			
			Collections.sort(list);
			
			bufferedWriter.write("Name,Age,Gender\n");
			for (Person person2 : list) {
				bufferedWriter.write(person2.toString()+"\n");
			}

		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
		for (Person person : list) {
			System.out.println(person);
		}

	}

}
