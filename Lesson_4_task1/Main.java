package Lesson_4.Lesson_4_task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Student student1 = new Student("Вася", 19, 6);
		// Student student2 = new Student("Петя", 20, 4);
		Teacher teacher1 = new Teacher("Alex", 44, "matimatic", 55);
		Teacher teacher2 = new Teacher("John", 39, "programming", 33);
		List<Teacher> list = new ArrayList<>();
		// list.add(student1);
		// list.add(student2);
		list.add(teacher1);
		list.add(teacher2);
		System.out.println(list);
		list.sort(new TeacherComparator<Teacher>());
		System.out.println(list);
		// StudentService studentService = new StudentService();
		// studentService.create("Вася", 19);
		// studentService.create("Петя", 20);
		// studentService.create("Alex", 44);
		// System.out.println(studentService.getAll());
	}

}
