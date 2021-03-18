public class ConditionalStatement {
    public static void main(String [] args){
        int age = 23;

        if (age > 20) {
            System.out.println("ты младше 20 лет");
        } else {
            System.out.println("проходи, мы тебя ждали");
        }
        
        boolean femininity = true;

        if (!femininity) {
            System.out.println("вижу в тебе мужество, достойное короля");
        } else {
            System.out.println ("создания чудеснее я еще не встречал");
        }

        double height = 1.58;

        if (height < 1.88) {
            System.out.println ("может, ты еще вырастешь");
        } else {
            System.out.println ("понятно");
        }

        char firstLetterOfName = 'N';

        if (firstLetterOfName == 'M') {
            System.out.println ("имя на М");
        } else if (firstLetterOfName == 'I') {
            System.out.println ("имя на I");
        } else {
            System.out.println ("я различаю только имена на I и M");
        }
    }
}