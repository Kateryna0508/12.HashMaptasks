public class Class {
	private String classCode;
	private String subjectName;
	private String time;

	public Class(String classCode, String subjectName, String time) { // Создать занятие
		this.classCode = classCode;
		this.subjectName = subjectName;
		this.time = time;
	}

	public String getClassCode() {
		return classCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public String getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Код занятия: " + classCode + ", Предмет: " + subjectName + ", Время: " + time;
	}
}