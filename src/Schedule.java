import java.util.HashMap;

public class Schedule {
	private HashMap<String, Class> scheduleMap;

	public Schedule() {
		this.scheduleMap = new HashMap<>();
	}

	public void addClass(Class cls) { // Добавить занятие
		if (scheduleMap.containsKey(cls.getClassCode())) {
			System.out.println("Занятие с таким кодом уже существует.");
		} else {
			scheduleMap.put(cls.getClassCode(), cls);
			System.out.println("Занятие добавлено: " + cls);
		}
	}

	public void removeClass(String classCode) { // Удалить занятие
		if (scheduleMap.containsKey(classCode)) {
			scheduleMap.remove(classCode);
			System.out.println("Занятие с кодом " + classCode + " удалено.");
		} else {
			System.out.println("Занятие с кодом " + classCode + " не найдено.");
		}
	}

	public Class searchClass(String classCode) { // Найти занятие по коду
		if (scheduleMap.containsKey(classCode)) {
			return scheduleMap.get(classCode);
		} else {
			System.out.println("Занятие с кодом " + classCode + " не найдено.");
			return null;
		}
	}

	public void displayAllClasses() { // Вывести все занятия
		if (scheduleMap.isEmpty()) {
			System.out.println("Расписание пусто.");
		} else {
			System.out.println("Все занятия в расписании:");
			for (Class cls : scheduleMap.values()) {
				System.out.println(cls);
			}
		}
	}
}