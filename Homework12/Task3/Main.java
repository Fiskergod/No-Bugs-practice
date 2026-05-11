package homework_12.task_3;

public class Main {
    static void main(String[] args) {
        GradeService<Number> gradeService = new GradeService<>();
        StudentGrade<Number> annaGrade1 = new StudentGrade<>("Anna", "Math", 3);
        StudentGrade<Number> annaGrade2 = new StudentGrade<>("Anna", "Math", 5);
        StudentGrade<Number> annaGrade3 = new StudentGrade<>("Anna", "Math", 4);

        Thread thread1 = new Thread(() -> {
            try {
                gradeService.addGrade(annaGrade1);
                gradeService.addGrade(annaInvalidGrade);
                gradeService.addGrade(annaGrade3);

            } catch (InvalidGradeException e) {
                //пробрасываем исключение дальше (оборачивая в непроверяемое), поток прерывается, если нашел исключение
                throw new RuntimeException(e);
            }

        });

        Thread thread2 = new Thread(() -> {
            try {
                gradeService.addGrade(new StudentGrade<>("Mila", "Literature", 4));
                gradeService.addGrade(new StudentGrade<>("Mila", "Literature", 5));
                gradeService.addGrade(new StudentGrade<>("Mila", "Literature", 5));

            } catch (InvalidGradeException e) {
                //пробрасываем исключение дальше (оборачивая в непроверяемое), поток прерывается, если нашел исключение
                throw new RuntimeException(e);
            }

        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("\nСредняя оценка по математике у Анны = " + gradeService.getAverageBySubject("Math"));

        System.out.println("\nСредняя оценка по литературе у Милы = " + gradeService.getAverageBySubject("Literature"));
    }
}
