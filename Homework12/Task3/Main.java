package homework_12.task_3;

public class Main {
    static void main(String[] args) {
        GradeService<Number> gradeService = new GradeService<>();
        StudentGrade<Number> annaGrade1 = new StudentGrade<>("Anna", "Math", 3);
        StudentGrade<Number> annaGrade2 = new StudentGrade<>("Anna", "Math", 5);
        StudentGrade<Number> annaGrade3 = new StudentGrade<>("Anna", "Math", 4);

        Thread thread1 = new Thread(() -> {
            gradeService.addGrade(annaGrade1);
            gradeService.addGrade(annaGrade2);
            gradeService.addGrade(annaGrade3);
        });

        Thread thread2 = new Thread(() -> {
            gradeService.addGrade(new StudentGrade<>("Mila", "Literature", 4));
            gradeService.addGrade(new StudentGrade<>("Mila", "Literature", 5));
            gradeService.addGrade(new StudentGrade<>("Mila", "Literature", 5));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("\nСредняя оценка по " + gradeService.getGradeList().getFirst().getSubject() + " = "
                + gradeService.getAverageBySubject("Math"));

        System.out.println("Средняя оценка по " + gradeService.getGradeList().getLast().getSubject() + " = "
                + gradeService.getAverageBySubject("Literature"));
    }
}
