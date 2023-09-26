package Lesson_4.Lesson_4_task1.Controller;

import java.util.List;

public interface UserService<T> {
	List<T> getAll(); 
}
