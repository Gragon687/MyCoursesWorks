public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        for(int i = 0; i < 65536; i++){
            char symbol = (char) i;
            if ((symbol >= 'А' && symbol <= 'я') || (symbol == 'Ё') || (symbol == 'ё')){
                System.out.println(symbol + "=" + i);
            }
        }

    }
}
