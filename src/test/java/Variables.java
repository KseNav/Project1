import org.testng.annotations.Test;

public class Variables {
    public int a = 2;
    public int b = 3;
    public String line1 = "Мама мыла раму";
    public String line2 = "Даша мыла куклу";

    @Test
    public void calculate () {
        int c = a + b;
        System.out.println("Результат сложения чисел = " + c);
    }
//todo Написать тест Сложение строчек
}
