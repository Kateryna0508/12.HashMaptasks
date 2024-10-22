import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Schedule schedule = new Schedule();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Выберите действие:");
			System.out.println("1. Добавить занятие");
			System.out.println("2. Удалить занятие");
			System.out.println("3. Найти занятие");
			System.out.println("4. Показать все занятия");
			System.out.println("5. Выйти");
			System.out.print("Введите номер действия: ");

			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) { //Проверка и реализация выбранного действия
				case 1:
					System.out.print("Введите код занятия: ");
					String classCode = scanner.nextLine();
					System.out.print("Введите название предмета: ");
					String subjectName = scanner.nextLine();
					System.out.print("Введите время проведения: ");
					String time = scanner.nextLine();

					// Создать класс для работы с занятиями
					Class newClass = new Class(classCode, subjectName, time);
					// Добавить занятие в общий список
					schedule.addClass(newClass);
					break;

				case 2:
					System.out.print("Введите код занятия для удаления: ");
					String codeToRemove = scanner.nextLine();
					// Удалить занятие из списка
					schedule.removeClass(codeToRemove);
					break;

				case 3:
					System.out.print("Введите код занятия для поиска: ");
					String codeToSearch = scanner.nextLine();
					Class foundClass = schedule.searchClass(codeToSearch);
					if (foundClass != null) {
						System.out.println("Найдено: " + foundClass);
					}
					break;

				case 4:
					// Вывести все занятия
					schedule.displayAllClasses();
					break;

				case 5:
					System.out.println("Выход из программы...");
					scanner.close();
					System.exit(0);
					break;

				default:
					System.out.println("Неверный ввод. Пожалуйста, выберите действие из списка.");
					break;
			}

			System.out.println();
		}
	}
}