public class ConditionalStatement {
    public static void main(String [] args){
        int age = 23;
        boolean femininity = true;
        char name = 'N';
        double growth = 1.58;

        if (age > 20) {
            System.out.println("ты младше 20 лет");
        } else {
            System.out.println("проходи, мы тебя ждали");
        }
        if (!femininity) {
            System.out.println("вижу в тебе мужество, достойное короля");
        }
        if (femininity) {
            System.out.println ("создания чудеснее я еще не встречал");
        }
        if (growth < 1.88) {
            System.out.println ("может, ты еще вырастешь");
        } else {
            System.out.println ("понятно");
        }
        if (name == 'M') {
            System.out.println ("имя на М");
        } else
        if (name == 'I') {
            System.out.println ("имя на I");
        }
        else {
            System.out.println ("я различаю только имена на I и M");
        }
    }
}