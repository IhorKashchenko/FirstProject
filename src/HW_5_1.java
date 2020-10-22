import javax.sound.midi.Soundbank;

public class HW_5_1 {
    public static void main(String[] args) {
//        #5.1
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == 'о') {
                System.out.println("о");
            }
        }


//       #5.2
//        String st = "Перестановочный алгоритм быстрого действия";
//        String str = " ";
//        for (int i = 0; i < st.length(); i++) {
//            if (st.charAt(i) == 'о') {
//                str = str + 'о';
//            }
//        } System.out.println(str);



//        #2
//        String s = ("Перевыборы выбранного президента");
//        int count = 0;
//        for (int i = 0; i < s.length(); i = i +1) {
//            if (s.charAt(i) == 'е') {
//                count = count + 1;
//            }
//        }
//        System.out.println(count);

//            #3
//        String s = "Посмотрите как Рите нравится ритм";
//        s = s.toLowerCase();
//        int i = s.indexOf("рит");
//        while (i != -1) {
//            System.out.println(i);
//            i = s.indexOf("рит", i + 1);
//        }
    }
}
